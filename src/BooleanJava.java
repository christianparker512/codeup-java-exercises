public class BooleanJava {
    public static void main(String[] args) {
//        TODO Auto generated Method Stub
        int i = 5;
        boolean  a = true;
        boolean b = false;
        System.out.println(b);
        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if (passedDoor){
            System.out.println("We are in the if statement!");
            System.out.println("We passed the first door");
            doorCount = doorCount +1;
        }
        if (passedDoor){

            System.out.println("We passed the second door");
            doorCount = doorCount +1;
        }
        if (passedDoor){
            System.out.println("We passed the third door");
            doorCount = doorCount +1;
        }
        if(doorCount==3) {
            passedAllDoors = true;
        }
        if (passedAllDoors) {
            System.out.println("You won the game!");
        }
    }
}
