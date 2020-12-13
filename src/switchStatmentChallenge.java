public class switchStatmentChallenge {
    public static void main(String[] args) {
        char charValue = 'P';
        switch (charValue){
            case 'A':
                System.out.println("A was Found");
                break;
            case 'B':
                System.out.println("A was Found");
                break;
            case 'C':
                System.out.println("A was Found");
                break;
            case 'D': case 'E': case 'F':
                System.out.println("A was Found");
                break;
            default:
                System.out.println("It wasn't found");
                break;

        }
        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            case "march":
                System.out.println("March");
                break;
            case "april":
                System.out.println("April");
                break;
            case "may":
                System.out.println("May");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
