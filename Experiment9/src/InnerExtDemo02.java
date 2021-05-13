/**
 * Interface A
 */
interface A_I2 {
    /**
     * Interface method printA
     */
    public void printA();

    /**
     * Inner class B
     */
    abstract class B {
        /**
         * Class B's abstract method printB
         */
        public abstract void printB();
    }
}

/**
 * Implantation of the interface A
 */
class X_I2 implements A_I2 {
    /**
     * Implantation of the interface method printA
     */
    public void printA() {
        System.out.println("HELLO --> A");
    }

    /**
     * Inner class extends the abstract class B
     */
    class Y extends B {
        /**
         * Implantation of the abstract method printB
         */
        public void printB() {
            System.out.println("HELLO --> B");
        }
    }
}

/**
 * Main class of the program
 */
public class InnerExtDemo02 {
    /**
     * Instantiate the Y class while the X class
     * Y class is the subclass of A.B
     * call the abstract class B's printB which will delegate to its real class Y's implantation
     * @param args
     */
    public static void main(String args[]) {
        A_I2.B b = new X_I2().new Y();
        b.printB();
    }
};
