package employee;

public class Business {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Christian"),
                new Manager("Jarrod", "Development"),
                new Developer("Lisa")
        };

        for(Employee e: employees) {
            e.sayHello();
            e.doWork();
        }
    }
}
