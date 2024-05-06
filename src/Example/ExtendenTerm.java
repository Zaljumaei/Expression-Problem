package Example;


/*
* In this way we can add new operation without changeing the existing code with typ-casting,
* but the problem is, that the Variants(Apply, Lambd and variable should be subclasses*/
public interface ExtendenTerm extends Term{

    void print();
}
