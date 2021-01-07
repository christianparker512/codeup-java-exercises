package Burger;

public class BurgerFactory {

    public Burger createBurger(){
        return new Burger();
    }
}
class HealthyBurgerFactory extends BurgerFactory{
    @Override
    public HealthyBurger createBurger(){
        return new HealthyBurger();
    }
}
