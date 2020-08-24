class CricketPlayer {
    private int matches;

    public CricketPlayer(int matches) {
        this.matches = matches;
    }

    public void displayDetails() {
        System.out.println("Matches played: " + matches);
    }
}

class Batsman extends CricketPlayer {
    private int runs;

    public Batsman(int matches, int runs) {
        super(matches);
        this.runs = runs;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Runs scored: " + runs);
    }
}

class Bowler extends CricketPlayer {
    private int wickets;

    public Bowler(int matches, int wickets) {
        super(matches);
        this.wickets = wickets;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wickets acquired: " + wickets);
    }
}

class WicketKeeper extends CricketPlayer {
    private int stumpOuts;

    public WicketKeeper(int matches, int stumpOuts) {
        super(matches);
        this.stumpOuts = stumpOuts;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Stump Outs: " + stumpOuts);
    }
}

public class CricketPlayerTest {

    public static void main(String[] args) {
        Batsman bat = new Batsman(10, 300);
        Bowler bowl = new Bowler(13, 25);
        WicketKeeper wk = new WicketKeeper(11, 13);

        System.out.println("\nBatsman details: ");
        bat.displayDetails();
        System.out.println("\nBowler details: ");
        bowl.displayDetails();
        System.out.println("\nWicket Keeper details: ");
        wk.displayDetails();
    }
}