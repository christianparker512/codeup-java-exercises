package JupiterMart;

import java.util.ArrayList;

public class Person {
//    I originally didn't have it private. Get an explanation as to why it's private.
    private String firstName;
    private String lastName;

    public Person (String first, String last){
//        I originally did not have the 'this' on both first and last. We do this so we can call.
        this.firstName = first;
        this.lastName = last;
        System.out.println("This employee's name is " + first + " " + last);
    }
//        Originally had getters and setters here. Why would I? Why aren't these necessary? Because they're getting called on the JupiterMart page?
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
    public void ringItem (Product item){
        System.out.println("ID# " + item.getId() + " The cost of this item is " + item.getPrice());
    }
    public double askForMoney( ArrayList<Product> ShoppingCart){
        double total = 0;
        for (Product item : ShoppingCart){
            total += item.getPrice();
        }
        return total;
    }
}
