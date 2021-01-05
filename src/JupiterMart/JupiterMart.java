package JupiterMart;

import java.util.ArrayList;

public class JupiterMart {
    public static void main(String[] args) {
        Person employee1 = new Person("Christian", "Parker");
        ArrayList<Product>ShoppingCart = new ArrayList<>();

        Computers laptop = new Computers("MacBook Pro", true);
        CellPhones iPhone = new CellPhones("12 Pro Max", "6.68 inches");

        laptop.setPrice(2999.99);
        iPhone.setPrice(1999.99);

        ShoppingCart.add(laptop);
        ShoppingCart.add(iPhone);

        int idCounter=0;
        for (Product item: ShoppingCart){
            item.setId(idCounter);
            idCounter++;
        }

        employee1.ringItem(laptop);
        employee1.ringItem(iPhone);

        System.out.println("Your total is : $" + employee1.askForMoney(ShoppingCart));

    }
}
