// kadane's Algorithm :- Kadane’s Algorithm is used to find the maximum sum of a contiguous subarray in an array of integers.

public class kadane {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sub array sum is: " + ms);
        System.out.println(numbers.length);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
    }

    public static void max(int numbers[]) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest Num in array is: " + max);
    }

    public static void min(int numbers[]) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest Num in array is: " + min);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, 88, -2, 1, 5, -3, -87 };

        min(numbers);

        kadanes(numbers);

        max(numbers);
    }
}
