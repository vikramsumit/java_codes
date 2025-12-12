// import java.util.*;

public class maxsubarraysum {
    public static void maxsubarraysum2(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // cal prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

            for(int i=0; i<numbers.length; i++){
                int start = i;
                for(int j=i; j<numbers.length; j++){
                    int end = j ;

                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
        }
    }
        System.out.println("maxsubarrays dum are:" + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,3,6,-5,-3};
        maxsubarraysum2(numbers);
    }
}
// import java.util.*;

// public class maxsubarraysum {
//     public static void maxsubarraysum2(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
        
//         // Calculate prefix array
//         for(int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         for(int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for(int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max subarray sum is: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2, 3, 6, -5, -3,99};
//         maxsubarraysum2(numbers);
//     }
// }
