public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("christian", 100);
        System.out.println("New Score is " + newScore);
        calculateScore(76);
        calculateScore();
//        calcFeetAndInchesToCentimeters(-1, 1);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player, no score");
        return 0;
    }
}
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
//            System.out.println(feet + inches);
//            return -1;
//        }
//        double centimeters = (feet * 12) * 2.54;
//        centimeters += inches * 2.54;
//        System.out.println("feet, " + inches + "inches " + centimeters + ".");
//    public static double calcFeetAndInchesToCentimeters(double inches){
//    if(inches<0){
//            return -1;
//        }}}}
//    double feet = (int) inches /12;
//    double remainInches = (int) inches %12;
//            System.out.println(inches + "inches is equal to " + feet + "feet and " + inches + "inches");
//    }