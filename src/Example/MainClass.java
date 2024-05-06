package Example;

public class Main {

    public static void main(String[] args) {
        Term test = new Apply();

        //test.print() ==> Wprint is not deklared in Term >> use Typ-Casting
        ((ExtendenTerm) test).print();
    }
}
