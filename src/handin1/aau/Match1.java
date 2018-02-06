package handin1.aau;

import java.util.Random;

public class Match1 {
    // Encapsulate information of a match.
    private Team Teamred;
    private Team Teamblue;

    // Constructor for the class.
    Match1(Team red, Team blue) {
        Teamred = red;
        Teamblue = blue;
    }

    // Method to calculate the average age of all players in the match.
    public double TeamAverageAge() {
        return ((Teamred.player1.age + Teamred.player2.age + Teamblue.player1.age + Teamblue.player2.age) / 4.0);
    }

    // Method to find and return the best player of all players in the match.
    public Player BestPlayer() {
        return ((Teamblue.BestPlayer().WinLoseRatio() >= Teamred.BestPlayer().WinLoseRatio())
                ? Teamblue.BestPlayer() : Teamred.BestPlayer());
    }

    // Method to determine which team have won the match.
    public Team MatchWinner(){
        Random rand = new Random();
        int RandomNum = rand.nextInt(2); // Declare and assign a random number from 0 to 1.

        // Match winner is chosen randomly.
        if (RandomNum == 0) {
            // Update player statistics accordingly for winning/losing.
            Teamred.player1.wonmatches += 1;
            Teamred.player2.wonmatches += 1;
            Teamblue.player1.lostmatches += 1;
            Teamblue.player2.lostmatches += 1;
            return Teamred;
        } else {
            // Update player statistics accordingly for winning/losing.
            Teamblue.player1.wonmatches += 1;
            Teamblue.player2.wonmatches += 1;
            Teamred.player1.lostmatches += 1;
            Teamred.player2.lostmatches += 1;
            return Teamblue;
        }
    }
}