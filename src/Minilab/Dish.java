package Minilab;

public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public void printSummary() {
        System.out.printf(
                "The cost of this dish is %d%n The name of this delicious dish is %s%n Would I recommend this dish? %b%n",
//                "Cost: %d%nName: %s%n Recommended: %b%n",
                costInCents,
                nameOfDish,
                wouldRecommend);
    }
}