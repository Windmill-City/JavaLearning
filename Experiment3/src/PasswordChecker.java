import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        int MAX_TRY = 3;
        int PASSWORD = 12345;

        int attempt = 0;
        Scanner scanner = new Scanner(System.in);

        while (attempt < MAX_TRY){
            attempt++;

            System.out.println("Input password:");
            int passwordIn = scanner.nextInt();
            if (passwordIn == PASSWORD){
                System.out.println("You are allowed to entry");
                System.exit(0);
            }else{
                System.out.println("Your password is incorrect, try again");
            }
        }
        System.out.println("You are locked out of the System");

        System.exit(0);
    }
}
