package JupiterMart;

public class Computers {
    String computerType;
    String operatingSystem;
    int computerID;
    int screenSize;
    boolean IsItALaptop;

    public Computers (String computer, String OS, int compID, int screen, boolean laptop){
        String computerType = computer;
        String operatingSystem = OS;
        int computerID = compID;
        int screenSize = screen;
        boolean IsItALaptop =  laptop;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getComputerID() {
        return computerID;
    }

    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isItALaptop() {
        return IsItALaptop;
    }

    public void setItALaptop(boolean itALaptop) {
        IsItALaptop = itALaptop;
    }
}
