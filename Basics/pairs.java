// import java.util.*;

// public interface pairs {
//     public static void printPairs(int numbers[]){
//         int to = 0;

//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//                 to++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " + to);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,5,2,8,3,1,0,7};

//         printPairs(numbers);
//     }
// }
public interface pairs {
    public static void printPairs(int numbers[]) {
        int to = 0;

        for (int i = 0; i < numbers.length; i++) { // Changed condition from i<=numbers.length to i<numbers.length
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                to++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + to);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 5, 2, 8, 3, 1, 0, 7};

        printPairs(numbers);
    }
}
