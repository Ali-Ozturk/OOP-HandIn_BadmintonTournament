package handin1.aau;

import java.util.Random;

public class Match1 {
    private Team Teamred;
    private Team Teamblue;

    Match1(Team red, Team blue) {
        Teamred = red;
        Teamblue = blue;
    }

    public double TeamAverageAge() {
        return ((Teamred.player1.age + Teamred.player2.age + Teamblue.player1.age + Teamblue.player2.age) / 4.0);
    }

    public Player BestPlayer() {
        return ((Teamblue.BestPlayer().WinLoseRatio() >= Teamred.BestPlayer().WinLoseRatio()) ? Teamblue.BestPlayer() : Teamred.BestPlayer());
    }

    public Team MatchWinner(){
        Random rand = new Random();
        int RandomNum = rand.nextInt(2); // Random number from 0 to 1.

        if (RandomNum == 0) {
            Teamred.player1.wonmatches += 1;
            Teamred.player2.wonmatches += 1;
            Teamblue.player1.lostmatches += 1;
            Teamblue.player2.lostmatches += 1;
            return Teamred;
        } else {
            Teamblue.player1.wonmatches += 1;
            Teamblue.player2.wonmatches += 1;
            Teamred.player1.lostmatches += 1;
            Teamred.player2.lostmatches += 1;
            return Teamblue;
        }
    }
}