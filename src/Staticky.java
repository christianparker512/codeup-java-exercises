public class Staticky {
    static int a = 0;

    public static void main(String[] args) {
        int b = 0;
        Staticky s = new Staticky();

        System.out.println(s.a);
    }
}
