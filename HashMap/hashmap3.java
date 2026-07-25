//Majority Element

import java.util.HashMap;
import java.util.Set;

public class hashmap3 {
    public static void main(String[] args) {

        int arr[] = {
                1, 3, 5, 23, 1, 56, 3, 2, 6, 1,
                2, 4, 1, 2, 1, 2, 1, 1, 1, 2,
                2, 2, 2, 2, 2, 1, 4, 4, 5, 3,
                1
        };

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequencies
        for (int num : arr) {
            // if (map.containsKey(num)) {
            //     map.put(num, map.get(num) + 1);
            // } else {
            //     map.put(num, 1);
            // }

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        // for (int i = 0; i < arr.length; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // Print the frequency map
        System.out.println(map);

        // Print elements occurring more than n/3 times
        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet) {
            if (map.get(key) >= arr.length / 6) {
                System.out.println(key);
            }
        }
    }
}
