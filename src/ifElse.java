import java.util.Scanner;

public class ifElse {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SuperFast RollerCoaster");
        System.out.println("Please enter your height in centimeters");
        int height = scanner.nextInt();

        if (height > 130 && height < 210) {
            System.out.println("You're good to go");
        }
//        else if (height >210){
//                System.out.println("You're too tall");
//        if (height >= 130){
//            System.out.println("You're tall enough");
        else {
            System.out.println("Sorry, you can't ride.");
        }
    }
}
