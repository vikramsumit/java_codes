import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(5);
        list.add(032);
        list.add(33);
        list.add(25);
        list.add(546);
        list.add(354);
        list.add(6);
        list.add(55);

        System.out.println(list);
        Collections.sort(list); //ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        // comparator - logiç function
        System.out.println(list);
    }
}
