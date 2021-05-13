/**
 * Interface Fruit, subclass of it can be eaten
 */
interface Fruit {
    public void eat();
}

/**
 * Apple class implements the Fruit
 */
class Apple implements Fruit {
    public void eat() {
        System.out.println("** 吃苹果。");
    }
}

/**
 * Orange class implements the Fruit
 */
class Orange implements Fruit {
    public void eat() {
        System.out.println("** 吃橘子。");
    }
};

/**
 * Factory class of the Fruit
 * construct different Fruit base on the className
 */
class Factory {
    public static Fruit getInstance(String className) {
        Fruit f = null;
        if ("apple".equals(className)) {
            f = new Apple();
        }
        if ("orange".equals(className)) {
            f = new Orange();
        }
        return f;
    }
}

/**
 * Main class of the program
 */
public class InterfaceCaseDemo04 {
    /**
     * Use the Fruit factory to construct the Fruit instance
     * and eat it
     * @param args
     */
    public static void main(String args[]) {
        Fruit f = Factory.getInstance("apple");
        f.eat();
    }
};

