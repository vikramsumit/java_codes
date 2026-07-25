//Hashset
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(8);
        set.add(6);
        set.add(8);
        set.add(16);
        set.add(5);

        System.out.println(set);
        // set.clear();
        System.out.println(set);
        
        System.out.println(set.size());
        System.out.println(set.isEmpty());


        // set.remove(6);
        if (set.contains(6)) {
            System.out.println("yes 6 is availabel");
        } else {
            System.out.println("6 is not available");
        }
    }
}
