public class arraycc3 {
    // Linear search method
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) { // fixed condition
            if (numbers[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // standard value for "not found"
    }

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 888 };
        int key = 100;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
