//Red Black Tree --> Read it
import java.util.*l

public class treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap();
        tm.put("India", 150);
        tm.put("China", 140);
        tm.put("US", 30);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("US", 30);

        System.out.println(tm);
        System.out.println(hm);
        
    }
}
