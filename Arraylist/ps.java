// PairSum -> BruteFOrce 

import java.util.*;

public class ps {
    public static boolean pairsum(ArrayList<Integer> list, int target){

        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);

        int target = 8;

        System.out.println(list);

        System.out.println(pairsum(list, target));
    }
}
