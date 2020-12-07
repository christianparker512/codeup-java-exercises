import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        System.out.println("The VIP pass? yes/no?");
        String vipPassReply = scanner.next();

        if (age > 18 && vipPassReply.equals("yes")) {
            System.out.println("Thanks. You can come in");
        } else {
            System.out.println("Sorry. End of the line, buddy");
        }
    }

}
