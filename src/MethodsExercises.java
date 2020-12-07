import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 2));
        System.out.println(subtraction(3, 2));
        System.out.println(multiply(3, 2));
        System.out.println(divide(3, 2));
        System.out.println(modulus(3, 2));
        System.out.println(product(3, 2));
        System.out.println(multiply2(6, 5));

    }


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int product(int num1, int num2) {
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 + product(num1, num2 -1);
    }

    public static int multiply2(int num2, int num1) {
        int product = 0;
        for (int i = 1; i <= num1; i++) {
            product += num2;
        }
        return product;
    }

}