import CaseChangingModule.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import java.io.*;

class CaseChangingClient {
    public static void main(String[] args) {
        CaseChanging caseChanger = null;
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            String name = "CaseChanging";
            caseChanger = CaseChangingHelper.narrow(ncRef.resolve_str(name));
            System.out.println("Enter String: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            String result = caseChanger.uppercase_string(str);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
