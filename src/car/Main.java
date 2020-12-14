package car;

public class Main {
    public static void main(String[] args) {
//        car porsche = new car();
//        car holden = new car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());
//        Account bobsAccount = new Account ("12345", 2500.00,"Christian Parker", "christianparker512@gmail.com", "512555-1212");
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100);

        Account chrisAccount = new Account("Chris", "chris@email.com", "12345");
        System.out.println(chrisAccount.getNumber() + " name " + chrisAccount.getCustomerName());
        System.out.println("Current balance is " + chrisAccount.getBalance());
        chrisAccount.withdrawal(100.55);


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("chris", 100.00);
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
