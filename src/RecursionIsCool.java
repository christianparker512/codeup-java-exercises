public class RecursionIsCool {
    //    public static void main(String[] args) {
//        sayHi(5);
//    }
    public static void main(String[] args) {
        countBackwards(14);
    }

    //    public static void sayHi(int n) {
//        if (n == 0 ) {
//            System.out.println("Done");
//        } else {
//            System.out.println("Hi");
//            n--;
//            sayHi(n);
//        }
    public static void countBackwards(int n) {
        if (n == 0) {

            System.out.println("Done");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
//
//}


//        we need a base case
        }
    }
}