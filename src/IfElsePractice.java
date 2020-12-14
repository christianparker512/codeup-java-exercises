import java.util.Scanner;
public class IfElsePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a grade: ");
        int n = scan.nextInt();

        if (n >= 90 && n <= 100){
            System.out.println("Congrats, you're getting an A");
        } else if (n >= 80 && n <= 90){
            System.out.println("You're getting a b");
        }else if (n >= 70&& n <= 80){
            System.out.println("You're getting a c");
        }else if (n >= 60 && n <= 70){
            System.out.println("You're getting a d");
        } else if (n >= 0 && n <= 60){
            System.out.println("You're getting a f");
        } else {
            System.out.println("The number you entered is not in the range");
        }
    }
}
