import java.util.Scanner;

public class TriangleArea {
    public static void calcTriangleAndOutput(float base, float height) {
        float area = 0.5f * base * height;
        System.out.printf("Triangle Area: %f%n", area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input base:");
            float base = scanner.nextFloat();

            System.out.println("Input height:");
            float height = scanner.nextFloat();

            calcTriangleAndOutput(base, height);

            System.out.println("Press enter Y/y to continue, else to exit");
            if (!scanner.next().matches("[Yy]")) return;
        }
    }
}
