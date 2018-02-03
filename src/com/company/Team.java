package com.company;

public class Team {
    public String Teamname;
    public Player player1;
    public Player player2;

    Team(String a, Player p1, Player p2){
        Teamname = a;
        player1 = p1;
        player2 = p2;
    }

    public double AverageAge() {
        return (player1.age + player2.age) / 2.0;
    }

    public Player BestPlayer(){
        return (player1.WinLoseRatio() >= player2.WinLoseRatio() ? player1 : player2);
    }
}
