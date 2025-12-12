import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {
        // java collection framework
        // className ObjectName = New className(); (uses in oops)

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // Add element
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(9);

        list.add(4,10); // O(n)
        System.out.println(list);

        // Adding number directly inlist

        // Get operation - O(1)
        int element = list.get(2);
        int element4 = list.get(4);

        System.out.println(element);
        System.out.println(element4);

        // Delete
        // list.remove(2);
        // System.out.println(list);

        // set element
        list.set(4, 88);
        System.out.println(list);

        // contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(9));
    }
}