import java.util.*;

public class ArrayListIterator{
    public static void main(String[] args){

        List<String>  list2 = new ArrayList<>();

        list2.add("TCS");
        list2.add("Wipro");
        list2.add("HCL");
        list2.add("Cognizant");
        list2.add("Infosys");
        list2.add("Accenture");
        
        Iterator<String> itr = list2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}