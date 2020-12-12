public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("christian", 100);
            System.out.println("New Score is " + newScore);
            calculateScore(76);
            calculateScore();
        }

        public static int calculateScore(String playerName, int score){
            System.out.println("Player " + playerName + " scored "+ score + "points");
            return score * 1000;
        }
        public static int calculateScore(int score){
            System.out.println("Unnamed Player scored "+ score + " points");
            return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("no player, no score");
        return 0;
    }
    }

