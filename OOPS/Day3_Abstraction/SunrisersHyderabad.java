package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class SunrisersHyderabad extends IPL{
    public static void main(String[] args) {
        SunrisersHyderabad players = new SunrisersHyderabad();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Heinrich Klaasen");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Aiden Markram");
        players.add("Abdul Samad");
        players.add("Rahul Tripathi");
        players.add("Glenn Phillips");
        players.add("Anmolpreet Singh");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("T Natarajan");
        players.add("Umran Malik");
        players.add("Bhuvneshwar Kumar");
        players.add("Mayank Markande");
        players.add("Fazalhaq Farooqi");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Abhishek Sharma");
        players.add("Washington Sundar");
        players.add("Sanvir Singh");
        players.add("Marco Jansen");
        return players;
    }
}
