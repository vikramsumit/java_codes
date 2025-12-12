import java.util.ArrayList;
import java.util.Collections;

public class pairsum1 {
    // public static Boolean pairsum1(ArrayList<Integer> list, int target){
    public static ArrayList<ArrayList<Integer>> pairsum1(ArrayList<Integer> list, int target){
        ArrayList<ArrayList<Integer>> allPairs = new ArrayList<>();

        for (int i =0; i<list.size(); i++){
            for (int j = i+1; j<list.size(); j++){
                if (list.get(i) + list.get(j) == target){
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(list.get(i));
                    pair.add(list.get(j));
                    // return pair;
                    allPairs.add(pair);
                }
            }
        }
        // return false;
        // return null;
        return allPairs;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Collections.addAll(list, 1,2,3,4,5,6,7,8);
        Collections.addAll(list, 41,52,243,54,55,546,657,8);

        ArrayList<ArrayList<Integer>> result = pairsum1(list, 8);
        // System.out.println(pairsum1(list, 8));

        if (!result.isEmpty()) {
            System.out.println("Pairs found:");
            for (ArrayList<Integer> pair : result) {
                System.out.println(pair);
            }
        } else {
            System.out.println("No pairs found");
        }
    }
}
