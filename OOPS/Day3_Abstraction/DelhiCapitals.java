package OOPS.Day3_Abstraction;

import java.util.ArrayList;

public class DelhiCapitals extends IPL{
    public static void main(String[] args) {
        DelhiCapitals players = new DelhiCapitals();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Abhishek Porel");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("David Warner");
        players.add("Prithvi Shaw");
        players.add("Yash Dhull");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Khaleel Ahmed");
        players.add("Anrich Nortje");
        players.add("Mustafizur Rahman");
        players.add("Kuldeep Yadav");
        players.add("Lungi Ngidi");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Axar Patel");
        players.add("Mitchell Marsh");
        players.add("Lalit Yadav");
        return players;
    }
}
