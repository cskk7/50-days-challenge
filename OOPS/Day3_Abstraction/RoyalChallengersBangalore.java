package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class RoyalChallengersBangalore extends IPL{
    public static void main(String[] args) {
        RoyalChallengersBangalore players = new RoyalChallengersBangalore();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }

    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Dinesh Karthik");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Virat Kohli ");
        players.add("Faf Du Plessis");
        players.add("Anuj Rawat");
        players.add("Suyash Prabhudessai");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Wanindu Hasaranga");
        players.add("Harshal Patel");
        players.add("Josh Hazlewood");
        players.add("Mohammad Siraj");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Glenn Maxwell");
        players.add("Mahipal Lomror");
        players.add("Shahbaz Ahemad");
        players.add("Karn Sharma");
        players.add("Cameroon Green");
        return players;
    }
}
