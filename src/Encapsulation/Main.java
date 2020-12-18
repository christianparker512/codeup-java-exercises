package Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Student s = new Student();
//        s.name="Tommy";
//        s.age=17;
        Student s = new Student();
        s.setName ("Chris");
        s.setAge(50);

        System.out.println(s.getName());
        System.out.println(s.getAge());
//        System.out.println(s.age);
    }

}
