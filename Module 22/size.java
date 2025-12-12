// import java.util.*;
import java.util.ArrayList;
public class size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(9);

        System.out.println(list.size());

        //print the arraylist
        for ( int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // System.out.println(null);

    }
}
