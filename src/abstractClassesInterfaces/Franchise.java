//package abstractClassesInterfaces;
////I am declaring this to be an abstract class.
//public abstract class Franchise {
//    // All the methods in an abstract class are like a list of rules or requirements for what needs to be implemented in any class that ** extends ** in htis abstract class.
//
//    //If we were to create a class taht extends a Franchise
//        //i.e. McDonalds on i-10 vs McDonalds on Loop 1604.
//
//    //Properties - constant values.
//    //This is always the same no matter where we build a franchise location.
//    private final String companyName = "McDonalds";
//    private String managerName;
////    if we have enough properties to warrant a constructo = to set those values when initializing this class = let's create that here. '
//    public Franchise (String managerName){
//        this.managerName = managerName;
//        this.companyName = "McDonalds";
//    }
//    //Methods
//    public abstract void broilStuff(String menuItem);  //broilStuff("bigMac");
//    //for example, 8am = 800, 10 pm = 2200
//    public abstract void businessHours(int openTime, int closeTime );
//
////    non-void method
//    public abstract boolean iceCreamMachineWokring();
//
////    non-abstract method
//    public void greetCustomer(){
//        //we have to write the method body, because we did not use the abstract keyworld when declaring the method.
//        System.out.println("Welcome to " + this.companyName + ". Enjoy your meal!");
//    }
////    Static
//    double result = Math.pow(10,2);
////    non-static
////    Math myCoolMathTool = new Math(){//the math library doesn't let us do this.
////}
//    public String getCompanyName (){
//        return companyName;//can retrieve this from any class that extends this abstract class, even though it's declared private.
//    }
//}
