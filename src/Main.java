public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

// Hey pangpang you are awesome!!

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//
//        }
//        else {
//            System.out.println("got here");
//        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
