package CollectionFrameWork.Map.Day13_TreeMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class TreeMap_Iterator {
    public static void main(String[] args) {
        Map<Integer,String> pincode = new TreeMap<>();
        pincode.put(608703, "Ariyalur");
        pincode.put(600001, "Chennai");
        pincode.put(624622, "Coimbatore");
        pincode.put(605007, "Cuddalore");
        pincode.put(635111, "Dharmapuri");
        pincode.put(624001, "Dindigul");
        pincode.put(638001, "Erode");
        pincode.put(600016, "Kanchipuram");
        pincode.put(621110, "Salem");

        Iterator<Map.Entry<Integer,String>>  itr = pincode.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Pincode: "+entry.getKey()+", City: "+entry.getValue());
        }
    }
}
