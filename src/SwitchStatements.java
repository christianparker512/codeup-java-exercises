import java.util.Scanner;
public class SwitchStatements {
    public static void main (String [] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered one.");
            case 2: System.out.println("You entered two");
            break;
            default:
                System.out.println("Invalid Number.");
        }
    }
}
