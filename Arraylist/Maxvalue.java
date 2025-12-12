import java.util.ArrayList;

public class Maxvalue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(-5163);
        list.add(8);
        list.add(12);
        list.add(21);
        list.add(6);
        list.add(45);
        list.set(4,654);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<list.size(); i++){
                // if( max < list.get(i)){
                //     max = list.get(i);
                // }
                max = Math.max(max, list.get(i));
                min = Math.min(min, list.get(i));
        }
        System.out.println("Max value are: " + max);
        System.out.println("min value are: " + min);

    }
}
