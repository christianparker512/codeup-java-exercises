package abstractClassesInterfaces;

public interface McFranchise {
//    properties
//    this string is a constant
    String companyName = "McDonalds";

//    We won't have a constructor in an interface(only in abstract classes)'
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();
//    abstract methods that we have to completely write out in any class that implements this interface
}
