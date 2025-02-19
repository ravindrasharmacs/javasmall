import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StringSorter {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("oranges");
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("Original list: " + list);

        Collections.sort(list ,(s1,s2)->Integer.compare(s1.length(),s2.length()));

        System.out.println("Sorted list: " + list);
    }
    
}
