import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert  --> O(1)
        map.put("Russia", 13);
        map.put("Ukraine", 4);
        map.put("France", 7);
        map.put("INDIA", 150);
        map.put("USA", 35);
        map.put("Indonesia", 30);

        System.out.println(map);

        // //Get - O(1)
        // int population = map.get("France");
        // System.out.println(population);
        // System.out.println(map.get("Australia"));

        // //Contains Key - O(1)
        // System.out.println(map.containsKey("INDIA"));
        // System.out.println(map.containsKey("Britain"));

        // //Remove
        // System.out.println(map.remove("Ukraine"));
        // System.out.println(map);

        // Size
        System.out.println(map.size());

        //IsEmpty       
        // map.clear();
        // System.out.println(map.size());

        //Iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" +k+ ",value="+map.get(k));
        }



    }
}
