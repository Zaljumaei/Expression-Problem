package AlgabricDataTypes.ExtensibleSum;


//This class illustrat the example of algabric datatybe in part 3.1 Extensible Sums
public class Term {
    private int val;

    public Term left;
    public Term right;

    Term(int val, Term left, Term right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public int number(int val)
    {
        return val;
    }

    public void plus(Term left,Term right)
    {

    }
}
