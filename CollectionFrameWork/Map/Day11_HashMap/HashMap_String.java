package CollectionFrameWork.Map.Day11_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_String {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Brand", "Maruti");
        map.put("Model", "Swift");
        map.put("Version", "vxi");
        map.put("Engine", "1.2 L");
        map.put("Color", "Red");
        map.put("Power", "83 bhp");
        map.put("Torque", "N-m");

        System.out.println(map);
    }
}