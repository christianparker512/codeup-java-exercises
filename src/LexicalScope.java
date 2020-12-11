import java.util.Scanner;
public class LexicalScope {
    public static void main (String[] args){
        int numPets=0;
//        if if statement below is false, it'll return 0 pets. The rest of the code doesn't run
//        if (false) {
        if (true) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("Enter the number of pets you own: ");
            numPets = scanner.nextInt();
        }
        System.out.println("you have " + numPets +" pets.");
    }
}
