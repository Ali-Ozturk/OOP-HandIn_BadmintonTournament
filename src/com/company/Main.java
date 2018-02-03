package com.company;

public class Main {
    public static void main(String[] args) {
        Player dennis = new Player("Dennis", "Kaufmann", 26, 10, 5);
        Player jack = new Player("Jack", "Jones", 20, 5, 10);
        Player cyka = new Player("Cyka", "Blyat", 19, 15, 3);
        Player potato = new Player("Russian", "Potato", 30, 2, 10);

        Team america = new Team("America", dennis, jack);
        Team russia = new Team("Russia", cyka, potato);

        // Average age of team 1
        double AvgTeam1 = america.AverageAge();
        // Average age of team 2
        double AvgTeam2 = russia.AverageAge();

        // New line for easier use.
        String newLine = System.getProperty("line.separator");

        System.out.println("Team statistics:");
        System.out.println("Team 1 average age: " + AvgTeam1);
        System.out.println("Team 2 average age: " + AvgTeam2 + newLine);

        Match1 match1 = new Match1(america, russia);

        System.out.println("Match 1 statistics:");
        double avgageall = match1.TeamAverageAge();
        System.out.println("The average age of match is: " + avgageall);

        Player BestPlayer = match1.BestPlayer();
        System.out.println("The best player of Match 1 is: " + BestPlayer.firstname + " " + BestPlayer.lastname + newLine);

        System.out.println("Best player statistics:");
        System.out.println("Name: " + BestPlayer.firstname + " " + BestPlayer.lastname);
        System.out.println("Age: " + BestPlayer.age);
        System.out.println("W/L: " + BestPlayer.wonmatches + " / " + BestPlayer.lostmatches + " Ratio: " + BestPlayer.WinLoseRatio());
        System.out.println("Current sponsor: " + BestPlayer.sponsor);

        // TODO: Winner of match and update stats afterwards.
    }
}