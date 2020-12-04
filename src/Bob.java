import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("You walk into Chris' office and see his iPhone. There are 37 texts messages from \"The Bobs\"");
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Text something to the Bobbies...");
            String bobConvo = sc.nextLine().trim();
//            System.out.println(answer);
            if(bobConvo.endsWith("?")){
                System.out.println("Nothing");
            } else if (bobConvo.endsWith("!")){
                System.out.println("Whatever Trace!");
            } else if (bobConvo.endsWith("")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Okay Bobs!");
            }
            System.out.println("Would you like to continue your conversation? Y/N");
            answer = sc.next();
;            } while(answer.equals("y"));
        }
    }

