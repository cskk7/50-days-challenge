package CollectionFrameWork.List.Day7_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListIterator {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);
        list.add(34);
        list.add(55);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
