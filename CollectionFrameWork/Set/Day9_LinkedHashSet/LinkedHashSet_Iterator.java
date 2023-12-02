package CollectionFrameWork.Set.Day9_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Iterator {
    public static void main(String[] args) {
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("Sunday");
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Saturday");

        Iterator<String> itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
