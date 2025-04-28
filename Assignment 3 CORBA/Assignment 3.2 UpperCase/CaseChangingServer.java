import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

import CaseChangingModule.CaseChanging;

class CaseChangingServer {
    public static void main(String[] args) {

        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();
            CaseChangingImpl caseChanger = new CaseChangingImpl();
            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(caseChanger);
            CaseChanging caseChangerRef = CaseChangingModule.CaseChangingHelper.narrow(ref);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            String name = "CaseChanging";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, caseChangerRef);
            System.out.println("CaseChanging Server Ready and Waiting...");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
