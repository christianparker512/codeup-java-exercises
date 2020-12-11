import java.sql.SQLOutput;

public class Methods {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus =200;
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Christian", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lisa", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Quincy", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Baxter", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {
            if (playerScore > 1000){
            return 1;
            } else if (playerScore > 500 && playerScore < 1000) {
                return 2;
            } else if(playerScore > 100 && playerScore < 500){
                    return 3;
            } else{
                return 4;
            }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("you final score was " + finalScore);
            return finalScore;
        }
        return -1;
//        }

    }
}



