package CollectionFrameWork.Map.Day12_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_String {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Vivo","V21");
        map.put("Oppo","F17");
        map.put("Redmi","Note 12");
        map.put("Apple","iPhone 14");
        map.put("OnePlus","Nord CE");
        map.put("Motorola","G5");
        
        System.out.println(map);
    }
}
