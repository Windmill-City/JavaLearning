/**
 * Declared an abstract class A
 * with a abstract print method inside
 * if a non-abstract subclass extend from A
 * it must implement the print method
 */
abstract class A_1 {
    public abstract void print();
}

/**
 * Non-abstract class B extend from A
 * it has implemented the print method
 * so it can be initialized
 */
class B_1 extends A_1 {
    /**
     * Implementation of the print method
     * which can print "Hello World" to the console when called
     */
    public void print() {
        System.out.println("Hello World!");
    }
}

/**
 * The Main class of the program
 */
public class AbstractCaseDemo01 {
    /**
     * Invoke the print method, whose implementation is B class
     * @param args
     */
    public static void main(String args[]) {
        A_1 a1 = new B_1();
        a1.print();
    }
}
