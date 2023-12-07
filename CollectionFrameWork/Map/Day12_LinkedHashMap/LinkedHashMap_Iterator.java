package CollectionFrameWork.Map.Day12_LinkedHashMap;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class LinkedHashMap_Iterator {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3245,"Bengaluru");
        map.put(5676,"Chennai");
        map.put(2343,"Visakhapattinam");
        map.put(5445,"Indore");
        map.put(1240,"Coimbatore");
        map.put(1461,"Kochi");
        map.put(1698,"Trichy");
        
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Number plate: "+entry.getKey()+", Vehicle: "+entry.getValue());
        }
    }
    
}
