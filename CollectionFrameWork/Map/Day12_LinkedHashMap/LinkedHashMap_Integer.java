package CollectionFrameWork.Map.Day12_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Integer {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(3, 8);
        
        map.put(5, 6);
        map.put(1, 10);
        map.put(4, 7);
        map.put(2, 9 );
        map.put(9, 2);
        map.put(7, 4);

        System.out.println(map);
    }
}
