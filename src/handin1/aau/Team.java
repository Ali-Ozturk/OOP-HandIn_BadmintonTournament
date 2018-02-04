package handin1.aau;

public class Team {
    // Encapsulate information of a team.
    public String Teamname;
    public Player player1;
    public Player player2;

    // Constructor for the class.
    Team(String a, Player p1, Player p2){
        Teamname = a;
        player1 = p1;
        player2 = p2;
    }

    // Method to calculate the average age of the players in a team.
    public double AverageAge() {
        return (player1.age + player2.age) / 2.0;
    }

    // Method to find and return the best player of a team.
    public Player BestPlayer(){
        return (player1.WinLoseRatio() >= player2.WinLoseRatio() ? player1 : player2);
    }
}
