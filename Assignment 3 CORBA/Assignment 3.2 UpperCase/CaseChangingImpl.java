import CaseChangingModule.CaseChangingPOA;

class CaseChangingImpl extends CaseChangingPOA {
    CaseChangingImpl() {
        super();
        System.out.println("CaseChanging Object Created");
    }

    public String uppercase_string(String name) {
        return ("Server send: " + name.toUpperCase());
    }
}
