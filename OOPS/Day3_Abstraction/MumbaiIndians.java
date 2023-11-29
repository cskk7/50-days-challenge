package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class MumbaiIndians extends IPL{
    public static void main(String[] args) {
        MumbaiIndians players = new MumbaiIndians();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }

    
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Ishan Kishan");
        return players;
    }


    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Suryakumar Yadav");
        players.add("Rohit Sharma");
        players.add("Dewald Brevis");
        players.add("Tilak Varma");
        return players;
    }

 
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Jofra Archer");
        players.add("Riley Meredith");
        players.add("Kumar Kartikeya");
        players.add("Akash Madhwal");
        return players;
    }

    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Piyush Chawla");
        players.add("Cameron Green");
        players.add("Jason Behrendorff");
        players.add("Tim David");
        return players;
    }
}
