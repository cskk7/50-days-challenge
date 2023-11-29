package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class PunjabKings extends IPL{
    public static void main(String[] args) {
        PunjabKings players = new PunjabKings();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }

    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Jitesh Sharma");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Shikhar Dhawan");
        players.add("Liam Livingstone");
        players.add("Jonny Bairstow");
        players.add("Prabhsimran Singh");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Kagiso Rabada");
        players.add("Rahul Chahar");
        players.add("Arshdeep Singh");
        players.add("Harpreet Brar");
        players.add("Nathan Ellis");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Shahrukh Khan");
        players.add("Shivam Singh");
        players.add("Sam Curran");
        players.add("Sikandar Raza");
        return players;
    }
}
