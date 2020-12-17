package FinalisFun;

public class Final {
//    global variables up here above the main
    final int MAX = 5;
    final int MIN =0;
    static final double PI = 3.14159;

    public void sayHi(){
        System.out.println("hi!");
    }

    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.MAX);
        f.sayHi();
    }
    class OtherClass extends Final {
        public void sayHi(){
            System.out.println("Hello hello!");
        }
    }
}
