import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GridPaths {
    private static int count = 0;
    private static List<String> findPaths(int m, int n) {
        StringBuilder moves = new StringBuilder();
        
        // Add (m-1) downs 'D' and (n-1) rights 'R'
        for (int i = 0; i < m - 1; i++) {
            moves.append("D");
        }
        for (int i = 0; i < n - 1; i++) {
            moves.append("R");
        }
        
        Set<String> permutations = new HashSet<>();
        permute(moves.toString(), 0, moves.length() - 1, permutations);
        
        return new ArrayList<>(permutations);
    }

    private static void permute(String str, int l, int r, Set<String> permutations) {
        if (l == r) {
            permutations.add(str);
            count++;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, permutations);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }    
    public static void main(String[] args) {
        int m = 54; // number of rows
        int n = 6; // number of columns
        List<String> paths = findPaths(m, n);
        
        // Print all unique paths
        for (String path : paths) {
            System.out.println(path);
        }
        System.out.println("Total no of ways: " + count);
    }
}

    