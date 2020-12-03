public class HelloWorld {

    public static void main (String[] args) {
        int id;
        id = 37;
//        Create a string variable and assign it a string variable. Must be two quotation, not single
//        String myString = "My name is Chris. I'm in the Jupiter Cohort";
//        change the code to assign the value of 3.14159
//        String myString = 3.14159;
//            result is double cannot be converted to java.lang.String

//        5. long myNumber;
//        7. long myNumber = 123L;
        long myNumber = 123;

        System.out.println(id);
        System.out.println("Hello Jupiter");
//        4. System.out.println(myString);
//        5. System.out.println(myNumber);
//            5. myNumber might not be initialized
        System.out.println(myNumber);
//            6. Possible lossy conversion from double to long
//              7 changing the assigned value of long myNumber to 123L yields 123 in the run terminal.
//                8 changing the assigned value of long myNumber to 123 yields 123 in the run terminal.
//                    9. 3.14 does not compile as a long, but a regular integer does. maybe should have been a float, due to the decimal?

//        10. int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        10. int class = 5;
//        System.out.println(++x);
//        System.out.println(x);

//            the difference is the positioning of the increment.

//            11. a variable of class gets an error due to it being an inspector

//                12. Object is the most generic type in Java. You can assign any value to a vairable of type object. What do you think will happen when the code is ran.
//        12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at HelloWorld.main(HelloWorld.java:42)

//        12.
//        int three = (int) "three";
//        incompatible types: java.lang.String cannot be converted to int

//        13. write in shorthand.
//        int x = 4;
////        x = x + 5;
////        int x ++;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y *x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(x);
//        System.out.println(y);

        int larger = 1000000000;
        larger = larger *5;
        System.out.println(larger);

//        when this is ran, this is the result. 705 032 704
//            I don't understand where this result came from'
    }

}

