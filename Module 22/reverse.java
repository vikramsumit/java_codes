// import java.util.*;
import java.util.ArrayList;
public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(33);
        list.add(9);

        // System.out.println(list.size());

        // for( int i=0;i<list.size();  i++){
        //     System.out.print(list.get(i) + " ");
        // }
            
        // for( int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i) + " ");  O(n)
        // }

        // System.out.println(null);

        // maximum value--- O(n)
        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        System.out.println("mac element value is: " + max);

    }
}

