package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something right here?");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.print(word1);
        System.out.print(word2);
        System.out.print(word3);


//        when dealing with numbers you have to use the nextInt, but if you're dealing with decimals you need to use nextFloat'
        float  number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();
        System.out.println(number1 + number2 + number3);
    }
}
