public class TheForStatement {

//    for statement is made to automate this and make this a lot more automated
    public static void main(String[] args) {
        System.out.println(("10,000 at 2% = "+ calculateInterest(10000.0,2.0)));
        System.out.println(("10,000 at 3% = "+ calculateInterest(10000.0,3.0)));
        System.out.println(("10,000 at 4% = "+ calculateInterest(10000.0,4.0)));
        System.out.println(("10,000 at 5% = "+ calculateInterest(10000.0,5.0)));

//        for (init; termination; increment){
//          for (int i =0; i < 9; i ++){
        for (double i =0; i < 9; i = i + 0.5){
              System.out.println("Your interest rate of  " + i + "% will add  $" + String.format("%.2f", calculateInterest(10000.00, i)) +" to your payment.");

        }

    }

    public static double calculateInterest(double amount,  double interestRate) {
        return(amount * (interestRate/100));

    }
}
