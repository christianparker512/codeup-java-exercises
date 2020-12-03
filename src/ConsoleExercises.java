import java.util.Scanner;
public class ConsoleExercises {
        public static void main(String[] args) {
                double pi = 3.14159;
//                %.2f output is two decimal points. Changing the number changes the output
                System.out.format("The value of pi is approximately %.2f.%n", pi);

                Scanner scanner = new Scanner(System.in);
                scanner.useDelimiter("\n");

                System.out.print("Enter three Words: ");

                String word1 = scanner.next();
                String word2 = scanner.next();
                String word3 = scanner.next();
//                %n stands for word1, word2 and word 3
                System.out.printf("You Entered: %n%s %n%s %n%s%n", word1, word2, word3);

                System.out.println("Enter your favorite number: ");
                int userNumber = scanner.nextInt();

                System.out.printf("You Entered: %d%n", userNumber);

                System.out.println("Enter the length and width of your room: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();

                System.out.printf("The area of your room is %.2f square feet%n", length * width);
                System.out.printf("The perimeter of your room is %.2f feet%n", 2*(length) + 2*(width));



                System.out.println("Enter random sentence: ");
                scanner.nextLine();
                String userPhrase = scanner.nextLine();
                System.out.printf("\"%s\"%n",userPhrase);

        }
}


