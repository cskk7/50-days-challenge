package CollectionFrameWork.Set.Day10_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Iterator {
    public static void main(String[] args) {
        Set<String> mobile = new TreeSet<>();
        mobile.add("HTC");
        mobile.add("Sony Ericcson");
        mobile.add("Nokia");
        mobile.add("Motorola");
        mobile.add("Apple");
        mobile.add("Huawei");
        mobile.add("Samsung");

        
        Iterator<String> itr = mobile.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
