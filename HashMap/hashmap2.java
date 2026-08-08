// HashMap, LinkedHashMap, and TreeMap ordering
import java.util.HashMap;
import java.util.LinkedHashMap;
// import java.util.TreeMap;

public class hashmap2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 140);
        lhm.put("US", 30);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("US", 30);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
