package javaPractice;

import java.sql.SQLOutput;

public class Store4 {
//    instance fields
    String productType;

//    constructor method
    public Store4 (String product){
        productType = product;
    }
    //advertise method
    public void advertise(){
        System.out.println("Come spend some money!!");
        System.out.println("Selling " + productType + "!");
    }

    public static void main(String[] args) {
        Store4 lemonadeStand = new Store4 ("Lemonade");
        Store4 videoGameStore = new Store4("video");
        lemonadeStand.advertise();
        videoGameStore.advertise();

    }
}
