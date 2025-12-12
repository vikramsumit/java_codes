//container with most water

import java.util.ArrayList;
import java.util.Collections;

public class CWMW {
    // public static int Storewater(ArrayList<Integer> height){
    // int maxWater = 0;
    // for(int i=0; i<height.size(); i++){
    // for(int j=i+1; j<height.size(); j++){
    // int ht = Math.min(height.get(i), height.get(j));
    // int width = j - i;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);

    // }
    // }
    // return maxWater;
    // }

    // 2 POINTER APPROACH
    public static int Storewater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculaate area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(currWater, maxWater);

            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        Collections.addAll(height, 1, 5, 8, 25, 4, 3, 154, 8, 9, 3, 7, 16, 57);

        System.out.println(Storewater(height));

    }
}
