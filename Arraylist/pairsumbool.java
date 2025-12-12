import java.util.ArrayList;
import java.util.Collections;

public class pairsumbool {
    public static boolean pairSum(ArrayList<Integer>list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case 2
         if (list.get(lp) + list.get(rp) < target) {
            lp++;
        }
        else{
            rp--;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8);

        System.out.println(pairSum(list,97));
    }
}
