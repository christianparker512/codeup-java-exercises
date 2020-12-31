package javaPractice;

public class SavingsAccount3 {
    int balance;

    public SavingsAccount3(int initialBalance){
        balance = initialBalance;
    }
    public static void main(String[] args) {
        SavingsAccount3 savings = new SavingsAccount3(2000);

//        check the balance
        System.out.println("Hello. Welcome to the bank!");
        System.out.println("Your balance is $" + savings.balance);

//        Withdrawing
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew $" + 300);
        System.out.println("Your balance now is $"+savings.balance);

        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited $" +600);
        System.out.println("Your balance is now $ " + savings.balance);

        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited $" + 600);
        System.out.println("Your balance is now $" + savings.balance);

    }
}
