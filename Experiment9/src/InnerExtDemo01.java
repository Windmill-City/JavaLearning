/**
 * Abstract class A
 */
abstract class A_I1 {
    public abstract void printA();

    /**
     * Inner class B
     */
    interface B {
        public void printB();
    }
}

/**
 * Non-abstract class X extends A
 * which gives implementation to the method printA
 */
class X extends A_I1 {
    public void printA() {
        System.out.println("HELLO --> A");
    }

    /**
     * Inner class Y implements the interface B
     * gives implementation to the method printB
     */
    class Y implements B {
        public void printB() {
            System.out.println("HELLO --> B");
        }
    }

}

/**
 * Main class of the program
 */
public class InnerExtDemo01 {
    /**
     * Instantiate the Inner class B while the A
     * and call printB
     * @param args
     */
    public static void main(String args[]) {
        A_I1.B b = new X().new Y();
        b.printB();
    }
}
