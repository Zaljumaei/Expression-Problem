package AlgabricDataTypes.ExtensibleSum;

public class ExtendedTerm extends  Term{
    private Term term;
    ExtendedTerm(int val, Term left, Term right) {
        super(val, left, right);
    }

    public String ident(String name)
    {
        term.plus(term.left , term.right );
        return name;
    }
}
