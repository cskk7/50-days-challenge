package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class RajasthanRoyals extends IPL{
    public static void main(String[] args) {
        RajasthanRoyals players = new RajasthanRoyals();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Sanju Samson");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Jos Buttler");
        players.add("Yashasvi Jaiswal");
        players.add("Shimron Hetmyer");
        players.add("Riyan Parag");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Adam Zampa");
        players.add("Kuldeep Sen");
        players.add("Navdeep Saini");
        players.add("Yuzvendra Chahal");
        players.add("Sandeep Sharma");
        players.add("Trent Boult");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Ravichandran Ashwin");
        return players;
    }
}
