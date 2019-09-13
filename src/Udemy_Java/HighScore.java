package Udemy_Java;
import javax.swing.*;


public class HighScore {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(50);
        displayHighScore("Raul", position);

        position = calculateHighScorePosition(1500);
        displayHighScore("Gigi", position);

        position = calculateHighScorePosition(600);
        displayHighScore("Marius", position);
    }

    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the highscore table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}