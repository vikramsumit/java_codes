import java.util.HashSet;
import java.util.Iterator;

public class hashset2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Kolkata");
        cities.add("los angles");
        cities.add("california");
        cities.add("Bengaluru");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
