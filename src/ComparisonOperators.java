public class ComparisonOperators {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 4;
//        boolean c = (a == b);
//        boolean d = (a >b);
//        System.out.println(c);

        double a = 2.4;
        if (a == 2.4){
            System.out.println("They are equal!");
        }
        if (a > 7) {
            System.out.println("Great than 7");
        }
        if (a == 2.4 || a == 2.5 || a == 6.1) {
            System.out.println("a is 2.4 or 2.5");
        }
        if (a >= 0 && a <= 100){
            System.out.println("A is in the range");
        }
    }
}
