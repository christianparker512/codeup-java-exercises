public class SwitchStatementsPractice {
    public static void main(String[] args) {
        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue =3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4 or a 5");
                System.out.println("Actually your value was " + switchValue);
//                You need the break below, otherwise it'll print the default below'
                break;
            default:
                System.out.println("Your value was not 1 or 2");

        }
    }
}
