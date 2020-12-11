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

    }
    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("you final score was " + finalScore);
            return finalScore;
        }
            return -1;
        }
    }



