// import java.util.*;
public class arraycc3 {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -5;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 888 };
        int key = 188;

        int index = linearsearch(numbers, key);
        if (index == -5) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
}
