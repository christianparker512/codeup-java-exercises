package car;

public class Main {
    public static void main(String[] args) {
//        car porsche = new car();
//        car holden = new car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());
        Account bobsAccount = new Account ("12345", 2500.00,"Christian Parker", "christianparker512@gmail.com", "512555-1212");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100);
    }
}
