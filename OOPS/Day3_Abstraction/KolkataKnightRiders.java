package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class KolkataKnightRiders extends IPL{
    public static void main(String[] args) {
        KolkataKnightRiders players = new KolkataKnightRiders();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
        

    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Liton Das");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Nitish Rana");
        players.add("Rinku Singh");
        players.add("Jason Roy");
        players.add("Rahmanullah Gurbaz");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Umesh Yadav");
        players.add("Tim Southee");
        players.add("Varun Chakravarthy");
        players.add("Shardul Thakur");
        players.add("Lockie Ferguson");

        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Venkatesh Iyer");
        players.add("Andre Russell");
        players.add("Sunil Narine");
        players.add("David Wiese");
        return players;
    }
}
