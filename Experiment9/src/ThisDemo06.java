/**
 * Interface A
 * with an interface method print
 */
interface A {
    public abstract void print();
}

/**
 * Implementation of A
 */
class B implements A {
    public void print() {
        System.out.println("Hello World!!!");
    }
}

/**
 * Main class of the program
 */
public class ThisDemo06 {
    /**
     * Instantiate the B class which is the subclass of A
     * call A's print will delegate to its real impl of B
     * @param args
     */
    public static void main(String args[]) {
        A a1 = new B();
        a1.print();
    }
};
