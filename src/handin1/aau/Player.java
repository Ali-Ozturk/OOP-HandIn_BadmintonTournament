package handin1.aau;

public class Player {
    public String firstname;
    public String lastname;
    public int age;
    public int wonmatches;
    public int lostmatches;
    public String sponsor;

    Player (String a, String b, int c, int d, int e, String f){
        firstname = a;
        lastname = b;
        age = c;
        wonmatches = d;
        lostmatches = e;
        sponsor = f;
    }

    Player (String a, String b, int c, int d, int e){
        firstname = a;
        lastname = b;
        age = c;
        wonmatches = d;
        lostmatches = e;
        sponsor = "None";
    }

    public double WinLoseRatio() {
        return ((double) this.wonmatches / this.lostmatches);
    }
}
