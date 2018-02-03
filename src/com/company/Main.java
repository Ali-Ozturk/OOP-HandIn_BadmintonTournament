package com.company;

public class Main {
    public static void main(String[] args) {
        Player dennis = new Player("Dennis", "Kaufmann", 26, 10, 5);
        Player jack = new Player("Jack", "Jones", 20, 5, 10);
        Player cyka = new Player("Cyka", "Blyat", 19, 15, 0);
        Player potato = new Player("Russian", "Potato", 30, 2, 10);

        Team america = new Team("America", dennis, jack);
        Team russia = new Team("Russia", cyka, potato);

        // Average age of team 1
        double avgteam1 = america.AverageAge();
        // Average age of team 2
        double avgteam2 = russia.AverageAge();

        System.out.println("Team statistics:");
        System.out.println("Team 1 average age: " + avgteam1);
        System.out.println("Team 2 average age: " + avgteam2);
        System.out.println(" ");

        Match1 match1 = new Match1(america, russia);

        System.out.println("Match 1 statistics:");
        double avgageall = Match1.AverageAge();
        System.out.println("The average age of match is: " + avgageall);
        // TODO: Best player in match
}
