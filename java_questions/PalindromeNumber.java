// import java.util.*;

// public class PalindromeNumber {
    
//     public static void palinno(int n){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         if (isPalindrome(number)) {
//             System.out.println(number + " is a palindrome.");
//         } else {
//             System.out.println(number + " is not a palindrome.");
//         }
//     }

//     static boolean isPalindrome(int number) {
//         int originalNumber = number;
//         int reversedNumber = 0;

//         while (number > 0) {
//             int remainder = number % 10;
//             reversedNumber = reversedNumber * 10 + remainder;
//             number /= 10;
//         }

//         return originalNumber == reversedNumber;
//     }

//     public static void main(String[] args) {
//         palinno(0);
// }
// }

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
