public class LeapYearExample {
    public static void main(String[] args) {
        int year = 2020;
                if(((year % 4 == 0 ) &&( year % 100 !=0) || year % 400 == 0 )){
                    System.out.println("It's Leap Year!");
                }
                else {
                    System.out.println("It's just a regular old common year!");
                }
            }
        }
