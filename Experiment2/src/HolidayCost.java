import java.util.Scanner;

public class HolidayCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number of people going on holiday");
        int peopleNum = scanner.nextInt();

        System.out.println("The cost of an individual holiday");
        float individualCost = scanner.nextFloat();

        System.out.printf("Total cost: %.2f", peopleNum * individualCost + 20);
    }
}
