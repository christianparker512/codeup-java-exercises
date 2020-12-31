package JupiterMart;



public class Person {
    String firstName;
    String lastName;

    public Person (String first, String last){
        firstName = first;
        lastName = last;
        System.out.println("This employee's name is " + first + " " + last);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
