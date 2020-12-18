package LinkyList;
import java.util.LinkedList;


public class Linky {
    public static void main(String[] args) {
        LinkedList linky = new LinkedList();

        linky.add("Chris");
        linky.add("Lisa");
        linky.add("Abby");
        linky.add("Quincy");
        linky.add("Baxter");

        System.out.println(linky);
        System.out.println(linky.getFirst());
        System.out.println(linky.getLast());
        System.out.println(linky.get(1));




    }
}
