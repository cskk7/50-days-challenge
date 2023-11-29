package OOPS.Day3_Abstraction;
import java.util.ArrayList;

public class ChennaiSuperKings extends IPL{
    public static void main(String[] args) {
        ChennaiSuperKings players = new ChennaiSuperKings();
        System.out.println(players.wicketKeeper());
        System.out.println(players.batsman());
        System.out.println();
    }

    @Override
    ArrayList<String> wicketKeeper() {
        ArrayList<String> players = new ArrayList<>();
        players.add("MS Dhoni");
        return players;
    }

    @Override
    ArrayList<String> batsman() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Devon Conway");
        players.add("Ruturaj Gaikwad");
        players.add("Ambati Rayudu");
        players.add("Ajinkya Rahane");
        return players;
    }

    @Override
    ArrayList<String> bowler() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Rajvardhan Hangargekar");
        players.add("Mitchell Santner");
        players.add("Tushar Deshpande");
        players.add("Deepak Chahar");
        players.add("Matheesha Pathirana");
        players.add("Maheesh Theekshana");
        return players;
    }

    @Override
    ArrayList<String> allRounder() {
        ArrayList<String> players = new ArrayList<>();
        players.add("Moeen Ali");
        players.add("Shivam Dube");
        players.add("Ravindra Jadeja");
        return players;
    }
}
