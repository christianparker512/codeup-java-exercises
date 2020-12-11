public class Person {
    private String name;

    public String getName() {
        return name;
    }
//    This is the constructor
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s!%n", this.name);
    }
    public static void main(String[] args) {
        Person person = new Person("Christian");

        System.out.println(person.getName());

        person.setName("Quincy");
        person.sayHello();


        //The strings are the same but the objects are not.
        Person person1 = new Person("Baxter");
        Person person2 = new Person("Baxter");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        //Person 3 and 4 are seen as the same object
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        //
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }
}

