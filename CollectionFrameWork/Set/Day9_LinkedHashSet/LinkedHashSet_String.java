package CollectionFrameWork.Set.Day9_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_String {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Cat");
        set.add("dog");
        set.add("monkey");
        set.add("cow");
        set.add("donkey");
        System.out.println(set);
    }
}
