public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
          count ++;
        }

//        for loops
    for (int i = 1; i <7; i++){
        System.out.println("Count value is " + count);
    }

    do {
        System.out.println("Count value was " + count);
        count ++;
    } while (count !=6);

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
        }
    }
}