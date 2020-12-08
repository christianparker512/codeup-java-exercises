import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
//        int i = 0;
//        do {
//            i ++;
//        } while (i<5);
//
////    } while(i <5){
////        i++;
            System.out.println("you rolled a " + num + ".");
            System.out.print("Roll again? y/n ");
            again = scanner.next();
        }while (again.equals("y"));
    }
}
