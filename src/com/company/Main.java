package com.company;

public class Main {
    public static void main(String[] args) {
        // Initiate player data
        Player player1 = new Player("Noah", "Smith", 26, 10, 5);
        Player player2 = new Player("William", "Jonhson", 20, 5, 10);
        Player player3 = new Player("Alexander", "Ivanov", 19, 15, 3, "Nike");
        Player player4 = new Player("Dmitry", "Kuznetsov", 30, 2, 10);

        // Initiate teams and assign players to teams
        Team team1 = new Team("USA", player1, player2);
        Team team2 = new Team("RUS", player3, player4);

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

        // Print the player with the best stats in the match.
        System.out.println("The player with the best stats in this game is: " + BestPlayer.firstname + " " + BestPlayer.lastname + newLine);

        PrintHeader(); // Used to create an header for player statistics.
        PrintPlayerStats(BestPlayer); // Method to print all stats of a specific player.

        System.out.println(newLine); // Create new line.

        // Declare and assign the team returned from method MatchWinner and assign it to the variable MatchWinner.
        Team MatchWinner = match1.MatchWinner();

        // Print winner of match.
        System.out.println("The winner of the match was: " + MatchWinner.Teamname);

        // Print header and stats of players of the winning team.
        PrintHeader();
        PrintPlayerStats(MatchWinner.player1);
        PrintPlayerStats(MatchWinner.player2);

    }

    // Method used to print player a given players statistics in a formatted manner.
    private static void PrintPlayerStats(Player player){
        System.out.println(String.format("%-12s | %-12s | %-4d | %-4d | %-4d | %-5.2f | %-10s" , player.firstname, player.lastname, player.age, player.wonmatches, player.lostmatches, player.WinLoseRatio(), player.sponsor));
    }

    // Method used for creating a formatted header.
    private static void PrintHeader(){
        System.out.println(String.format("%-12s | %-12s | %-4s | %-4s | %-4s | %-5s | %-10s" , "FIRST NAME", "LAST NAME", "AGE", "WON", "LOST", "RATIO", "SPONSOR"));
        System.out.println("----------------------------------------------------------------------");
    }
}