import java.util.*;


public class hashset2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Kolkata");
        cities.add("los angles");
        cities.add("california");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for (String city : cities) {
        //     System.out.println(city);
        // }
        System.out.println(cities);

        //LINKED HASHSET
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Hyderabad");
        lhs.add("Delhi");
        lhs.add("New york");
        lhs.add("osaka");
        lhs.add("tokyo");
        
        System.out.println(lhs);
        
        //TREESET
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Moscow");
        ts.add("Hong Kong");
        ts.add("paris");
        ts.add("sydney");
        ts.add("Beijing");
        ts.add("canberra");

        System.out.println(ts);
    }
}
