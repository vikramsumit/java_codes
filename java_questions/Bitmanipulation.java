// import java.util.*; 

public class Bitmanipulation {
    public static void main(String[] args) {
        System.out.println((5 & 6));
        // Bitwise AND: 5 (0101) & 6 (0110) = 4 (0100)

        System.out.println((5 & 3));
        // Bitwise AND: 5 (0101) & 3 (0011) = 1 (0001)

        System.out.println((5 | 6));
        // Bitwise OR: 5 (0101) | 6 (0110) = 7 (0111)

        System.out.println((5 ^ 6));
        // Bitwise XOR: 5 (0101) ^ 6 (0110) = 3 (0011)

        System.out.println((~5));
        // Bitwise NOT: ~5 → -(5 + 1) = -6 (2's complement)

        System.out.println((~0));
        // Bitwise NOT of 0 → -1 (all bits become 1)

        System.out.println((5 << 2));
        System.out.println((5 << 1));
        System.out.println((4 << 3));
        // Left shift: 5 (0101) << 2 = 20 (10100)
        // Multiplies 5 by 2^2

        System.out.println((55 << 8));
        // Left shift: 55 << 8 = 55 * 2^8 = 14080

        System.out.println((6 >> 2));
        // Right shift: 6 (0110) >> 2 = 1 (0001)
        // Divides by 2^2

        System.out.println((6 >> 1));
        System.out.println((256 >> 3));
        // Right shift: 6 (0110) >> 1 = 3 (0011)
        // Divides by 2
    }
}
