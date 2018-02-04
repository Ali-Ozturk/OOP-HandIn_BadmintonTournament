package com.company;

public class Main {
    public static void main(String[] args) {
        // Initiate player data
        Player dennis = new Player("Dennis", "Kaufmann", 26, 10, 5);
        Player jack = new Player("Jack", "Jones", 20, 5, 10);
        Player cyka = new Player("Cyka", "Blyat", 19, 15, 3);
        Player potato = new Player("Russian", "Potato", 30, 2, 10);

        // Initiate teams and assign players to teams
        Team team1 = new Team("America", dennis, jack);
        Team team2 = new Team("Russia", cyka, potato);

        // Easier adding of NewLines to use during prints.
        String newLine = System.getProperty("line.separator");

        // Declare and assign the value of the average age of players in team.
        double AvgAgeTeam1 = team1.AverageAge();
        double AvgAgeTeam2 = team2.AverageAge();

        // Print the average age of each team.
        System.out.println("Team " + team1.Teamname + " has an average age of " + AvgAgeTeam1 + ".");
        System.out.println("Team " + team2.Teamname + " has an average age of " + AvgAgeTeam2 + "." + newLine);

        // Initiate a match between team1 and team2.
        Match1 match1 = new Match1(team1, team2);

        // Declare and assign the value of the average age of all players.
        double avgageall = match1.TeamAverageAge();

        // Print match statistics.
        System.out.println("Match 1 | " + team1.Teamname + " vs. " + team2.Teamname + " |");
        System.out.println("The average age of all players in the match is: " + avgageall);

        // Declare and assign a player returned from the method BestPlayer.
        Player BestPlayer = match1.BestPlayer();
        System.out.println("The player with the best stats in this game is: " + BestPlayer.firstname + " " + BestPlayer.lastname + newLine);
        PrintHeader();
        PrintPlayerStats(BestPlayer);

        System.out.println(newLine);
        Team MatchWinner = match1.MatchWinner();

        System.out.println("The winner of the match was: " + MatchWinner.Teamname);

        PrintHeader();
        PrintPlayerStats(MatchWinner.player1);
        PrintPlayerStats(MatchWinner.player2);

    }

    public static void PrintPlayerStats(Player player){
        System.out.println(String.format("%-12s | %-12s | %-4d | %-4d | %-4d | %-5.2f | %-10s" , player.firstname, player.lastname, player.age, player.wonmatches, player.lostmatches, player.WinLoseRatio(), player.sponsor));
    }

    public static void PrintHeader(){
        System.out.println(String.format("%-12s | %-12s | %-4s | %-4s | %-4s | %-5s | %-10s" , "FIRST NAME", "LAST NAME", "AGE", "WON", "LOST", "RATIO", "SPONSOR"));
        System.out.println("----------------------------------------------------------------------");
    }
}