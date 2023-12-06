package CollectionFrameWork.Map.Day11_HashMap;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class HashMap_Iterator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer,String> players = new HashMap<>();
        players.put(0,"Sehwag");
        players.put(7, "Dhoni");
        players.put(10, "Sachin");
        players.put(18, "Kohli");
        players.put(45, "Rohit Sharma");

        Iterator<Map.Entry<Integer,String>> itr = players.entrySet().iterator();
        while ((itr.hasNext())) {
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Key: "+entry.getKey()+" , Value: "+entry.getValue());
        }
    }
}
