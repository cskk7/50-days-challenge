package CollectionFrameWork.Map.Day11_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Integer {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(2,4);
        map.put(3,9);
        map.put(4,16);
        map.put(5,25);
        map.put(6,36);
        map.put(7,49);
        map.put(8,72);
        map.put(9,81);
        map.put(10,100);

        System.out.println(map);
    }
}
