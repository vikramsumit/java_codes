public class maxsubarray {
    public static void maxsubarraysum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j ;
                currSum = 0;
                for(int k=start; k<=end; k++){ // used in printing inly
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            // System.out.println();
        }
        System.out.println("maxsubarrays sum are:" + maxSum);
    }
    public static void main(String[] args) {
        // int numbers[] = {2,3,25,5,7,33,77,44,88,89,96};
        // int numbers[] = {2,3,6};
        int numbers[] = {-2,3,6,-5,-3};
        maxsubarraysum(numbers);
    }
}
