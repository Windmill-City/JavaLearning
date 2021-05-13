/**
 * Abstract class of Animal
 * we can get name and age from it
 * and make the Animal say something
 */
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void say() {
        System.out.println(this.getContent());
    }

    /**
     * Abstract method getContent
     * Which returns a string used it say() method
     * @return say content
     */
    public abstract String getContent();
};

/**
 * Animal cat
 */
class Cat extends Animal {
    private String call;

    /**
     * Constructor method of cat
     * @param name the name of the cat
     * @param age the age of the cat
     * @param call the call of the cat
     */
    public Cat(String name, int age, String call) {
        super(name, age);
        this.call = call;
    }

    /**
     * @return the say content of Cat
     */
    public String getContent() {
        return " 姓名：" + super.getName() +
                "；年龄：" + super.getAge() +
                "；叫声：" + this.call;
    }
};

/**
 * Animal Dog
 */
class Dog extends Animal {
    private String call;

    /**
     * Constructor of the Dog
     * @param name name of the dog
     * @param age age of the dog
     * @param call call of the dog
     */
    public Dog(String name, int age, String call) {
        super(name, age);
        this.call = call;
    }

    /**
     * @return the say content of Dog
     */
    public String getContent() {
        return "姓名：" + super.getName() +
                "；年龄：" + super.getAge() +
                "；叫声：" + this.call;
    }
};

/**
 * Main class of the program
 */
public class AbstractCaseDemo02 {
    /**
     * Call the say method of the abstract class Anlimal
     * which will delegate to its real class(type)
     * @param args
     */
    public static void main(String args[]) {
        Animal per1 = null;
        Animal per2 = null;
        per1 = new Cat("猫儿", 2, "喵儿");
        per2 = new Dog("小狗", 10, "wangwang");
        per1.say();
        per2.say();
    }
};

