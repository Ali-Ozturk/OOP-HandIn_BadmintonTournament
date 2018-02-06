package handin1.aau;

public class Player {
    // Encapsulate information of a player.
    public String firstname;
    public String lastname;
    public int age;
    public int wonmatches;
    public int lostmatches;
    public String sponsor;

    // Constructor for the class with a user-defined Sponsor data.
    Player (String a, String b, int c, int d, int e, String f){
        firstname = a;
        lastname = b;
        age = c;
        wonmatches = d;
        lostmatches = e;
        sponsor = f;
    }

    // Constructor for the class with a predefined sponsor data.
    Player (String a, String b, int c, int d, int e){
        firstname = a;
        lastname = b;
        age = c;
        wonmatches = d;
        lostmatches = e;
        sponsor = "None";
    }

    // Method to calculate the Win lose ration between a players information.
    public double WinLoseRatio() {
        return ((double) this.wonmatches / this.lostmatches); // Typecasting return value as double
    }
}
