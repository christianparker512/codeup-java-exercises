import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
////      1.  declared and initialized the variable i with a value of five
//        int i = 5;
////            a while loop that will continue if i is less than or equal to 15
//        while ( i<=15){
////            this is how you show output in the console. println prints one line at a time.
////            System.out.println("i is " + i +".");
//            System.out.print(i + " ");
////            i is the iteration adding one each time
//            i++;
//        }
//            refactored using a for loop
//            for (int i =5; i <=15; i++){
//                System.out.printf("%d ", i);
//            }
//            2a. Do While.
//                - Create a do - while loop that will count by 2's starting with 0 and ending wit at 100.
//                - Follow each number with a new line'
//                int i = 0;
//                do {
//                        System.out.println(i);
//                        i +=2;
//                } while (i <= 100);

//                for (int i = 0; i <=100; i+=2){
//                    System.out.printf("%d%n", i);
//                }
//            2b.- Alter your loop to count backwards by 5's from 100 to -10.
//            int i = 100;
//            do {
//                System.out.println(i);
//                i -=5;
//            } while (i >= -10);
//
//        }
//            for (int i =100; i >=-10; i -=5){
//                System.out.printf("%d%n, i");
//            }
//            2c.- Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int)Math.pow(i,2);
//        } while (i <= 1000000);

//        2. FizzBuzz
//            Write a program that prints the numbers from 1 to 100.
//            For multiples of three. Print fizz instead of the number
//                For of five. print buzz
//                for multiples of both three and five print fizzbuzz

//            for (int i = 1; i <= 100; i++){
//                if (i % 15 == 0){
//                    System.out.printf("FizzBuzz");
//                } else if (i % 3 == 0){
//                    System.out.printf("Fizz");
//                    } else if (i % 5 == 0){
//                        System.out.printf("Buzz");
//                    } else {
//                        System.out.println(i);
//                }
//            }
//    }
//        3. Display a table of powers.
//
//           -Prompt the user to enter an integer.
//           -Display a table of squares and cubes from 1 to the value entered.
//           -Ask if the user wants to continue.
//           -Assume that the user will enter valid data.
//           -Only continue if the user agrees to.

        String answer;
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("What was your grade on the last quiz?");
//            int grade = scanner.nextInt();
//
//            if (grade <= 100 && grade >= 90) {
//
//                System.out.println("Congratulations! You Rock! You're getting an A!");
//            } else if (grade <= 89 && grade >= 80) {
//                System.out.println("Way to go! You got a B. An A is within your grasp!");
//            } else if (grade <= 79 && grade >= 70) {
//                System.out.println("C is average. You need to study harder");
//            } else if (grade <= 69 && grade >= 60) {
//                System.out.println("Well At least you passed. You have to do better next time!");
//            } else {
//                System.out.println("Come on. You can do better. Sorry you failed. You can do better!");
//            }
//            System.out.println();
//            System.out.println("Would you like to continue? (yes or no?)");
//            answer = scanner.next();
//        } while (answer.equalsIgnoreCase("yes"));



        do {
            System.out.println("Enter a random number?");
            int userNumber = scanner.nextInt();
            System.out.println("Here is your table!");

            System.out.println("number | squared | cubed");
            System.out.println("______ | ------- | _____");

            for (int i = 1; i <= userNumber; i+=1){
                System.out.printf("%6d |%7d | %d%n", i, i*i, i*i*i);
            }
            System.out.println();
            System.out.println("Would you like to continue? (y/n)");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("y"));

        }
        }