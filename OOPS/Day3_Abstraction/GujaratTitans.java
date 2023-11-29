package OOPS.Day3_Abstraction;
import java.util.ArrayList;

public class GujaratTitans extends IPL{
    public static void main(String[] args) {
        GujaratTitans players = new GujaratTitans();
        System.out.println("Wicket Keeper : "+players.wicketKeeper());
        System.out.println("Batsmen : "+players.batsman());
        System.out.println("Bowlers : "+players.bowler());
        System.out.println("All Rounders : "+players.allRounder());
    }
    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Wriddhiman Saha");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Shubman Gill");
        players.add("David Miller");
        players.add("Matthew Wade");
        players.add("Sai Sudharsan");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Rashid Khan");
        players.add("Alzarri Joseph");
        players.add("Mohammed Shami");
        players.add("Yash Dayal");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Hardik Pandya");
        players.add("Rahul Tewatia");
        players.add("Vijay Shankar");
        players.add("Jayant Yadav");

        return players;
    }
}
