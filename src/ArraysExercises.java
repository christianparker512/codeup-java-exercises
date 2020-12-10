import java.util.Arrays;

public class ArraysExercises {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
// This prints the location of the array [I@2c8d66b2, not the array of (1,2,3,4,5).
        System.out.println(numbers);
//    }
        Person[] people = new Person[3];
        people[0] = new Person("Christian");
        people[1] = new Person("Lisa");
        people[2] = new Person("Abby");
//            Quincy and Baxter are out of the length of the array. It's only a 3 element array.'
//            people[3] = new Person("Quincy");
//            people[4] = new Person("Baxter");

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
            public static Person [] addPerson (Person[] arr, Person personToAdd) {
                Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
                newArray[newArray.length - 1] = personToAdd;
                return newArray;

}}
