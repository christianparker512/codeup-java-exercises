package util;

public class InputTest {
    public static void main(String[] args) {
        Input scan = new Input();
        System.out.println(scan.getString());
        System.out.println(scan.yesNo());
        System.out.println(scan.getInt(3,11));
        System.out.println(scan.getInt());
        System.out.println(scan.getDouble(5.37, 37.37));
        System.out.println(scan.getDouble());
    }
}
