package Headphones;

public class Headphones {
    String charge = "Micro usb";
    String [] controls = {"power", "volume", "skip", "play/pause"};
    String color = "red/black";

    static boolean power = false;
    static int volume = 0;
    public static void powerOn(){
        power = true;
    }
    public static void powerOff() {
        power = false;
    }
    public static void volumeUP() {
        volume++;
    }
    public static void volumeDown(){
        volume--;
    }
}
