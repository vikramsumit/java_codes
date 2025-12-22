// import java.util.*;

public class Subarray {
    public static void subarrays(int numbers[]) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) { // used in printing inly
                    System.out.print(numbers[k] + " "); // sub array
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are:" + count);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 25, 5, 7, 33, 77, 44, 88, 89, 96 };
        subarrays(numbers);
    }
}
