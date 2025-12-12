import java.util.ArrayList;
// import java.util.*;

public class Classroom{
    public static void main(String[] args) {
        //java colleaction framework

        ArrayList<Integer> list = new ArrayList<>();        
        ArrayList<String> list2 = new ArrayList<>();        
        ArrayList<Boolean> list3 = new ArrayList<>();   
        
        list.add(2);
        list.add(74);
        list.add(8);
        list.add(44);
        list.add(555);
        list.add(1, 99);
        System.out.println(list);

        //Get operation- O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove operation
        // list.remove(0);
        // System.out.println(list);

        //Get operation- O(1)
        // int element2 = list.get(2);
        // System.out.println(element2);

        // System.out.println(list.contains(520));

        //set 
        // list.set(3, 520);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(74));
        // System.out.println(list.contains(548));
        // System.out.println(list.contains(520));
    }
}