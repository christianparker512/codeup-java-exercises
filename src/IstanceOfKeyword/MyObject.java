package IstanceOfKeyword;

interface Bird {
    public void sing();
//        System.out.println("Singing!");
    }

//class Eagle extends Bird {
   class Eagle implements Bird {
    public void sing() {
        System.out.println("Singin!");
    }
}
public class MyObject {
    public static void main(String[] args) {
        MyObject o = new MyObject();
        Eagle e = new Eagle ();
//        Eagle e = null;
        System.out.println(o instanceof MyObject);
        //This checks if its a class, subclass or an interface.

    }
}
