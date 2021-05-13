/**
 * Interface Fruit, subclass of it can be eaten
 */
interface Fruit_1 {
    public void eat();
}

/**
 * Apple class implements the interface Fruit which means it can be eaten
 */
class Apple_1 implements Fruit_1 {
    public void eat() {
        System.out.println("** 吃苹果。");
    }
}

/**
 * Orange class, implements the interface fruit which means it can be eaten
 */
class Orange_1 implements Fruit_1 {
    public void eat() {
        System.out.println("** 吃橘子。");
    }
}

/**
 * Main class of the program
 */
public class InterfaceCaseDemo03 {
    /**
     * Instantiate the Apple class, which is the subclass of the Fruit
     * and eat it
     * @param args
     */
    public static void main(String args[]) {
        Fruit_1 f = new Apple_1();
        f.eat();
    }
};
