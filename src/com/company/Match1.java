package com.company;

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
}