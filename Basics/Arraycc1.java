// import java.util.*;

public class Arraycc1 {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 888 };
        // String fruits[] = {"raja" , "khaja" , "bamd" , "baja"};
        int key = 18;

        int index = linearsearch(numbers, key);
        if (index == 0) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index:" + index);
        }
    }
}
