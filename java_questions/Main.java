import java.util.Scanner;

class PalindromeChecker {
    private int number;

    public PalindromeChecker(int number) {
        this.number = number;
    }

    public boolean isPalindrome() {
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();

        PalindromeChecker checker = new PalindromeChecker(userInput);

        if (checker.isPalindrome()) {
            System.out.println(userInput + " haan palindrome hai.");
        } 
        else {
            System.out.println(userInput + " nhi hai palindrome be.");
        }
    }
}
