import java.util.ArrayList;

public class swap {
    public static void swap (ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(44);
        list.add(14);
        list.add(42);
        list.add(47);
        list.add(66);
        list.add(54);

        int idx1 = 1; int idx2 = 4;

        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
