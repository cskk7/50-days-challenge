package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class LucknowSuperGiants extends IPL{
    public static void main(String[] args) {
        LucknowSuperGiants players = new LucknowSuperGiants();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Quinton De Kock");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("KL Rahul");
        players.add("Nicholas Pooran");
        players.add("Devdutt Padikal");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Ravi Bishnoi");
        players.add("Avesh Khan");
        players.add("Mark Wood");
        players.add("Mohsin Khan");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Marcus Stoinis");
        players.add("Deepak Hooda");
        players.add("Krunal Pandya");
        return players;
    }
}
