package Minilab;

public class DishTest {
    public static void main(String[] args) {
        Dish d = new Dish();

        d.costInCents = 2399;
        d.nameOfDish = "Braised Short Ribs and Risotto";
        d.wouldRecommend = true;

        d.printSummary();
        DishTools.analyzeDishCost(d);
        DishTools.souhtDishName(d);
        DishTools.flipRecommendation(d);
    }
}