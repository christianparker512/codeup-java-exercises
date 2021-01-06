package ExamReview;

public class CarDealership {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Ry Sutton",10000, 650 );
        Employee newEmployee = new Employee("Christian ");
        Vehicle newVehicle = new Vehicle (2000, "GMC", "Sierra", "2DR");


        newCustomer.purchaseCar(newVehicle, newEmployee, false);

    }
}
