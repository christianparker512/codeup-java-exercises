//import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {
        System.out.println(addition(3,2));
        System.out.println(subtraction(37,50));
        System.out.println(multiplication(5,5));
        System.out.println(division(15,3));
    }
//    method overloading. same methods with different parameters.
    public static int addition (int num1, int num2){
        return num1 + num2;

        }
    public static int subtraction(int num1, int num2){
       return (num1 - num2);
    }
    public static int multiplication (int num1, int num2){
        return (num1 * num2);
        }
    public static int division (int num1, int num2){
        return (num1/ num2);
    }
    public static int  modulus (int num1, int num2){
        return (num1 % num2);
    }

}
