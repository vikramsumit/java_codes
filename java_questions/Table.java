import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }

        sc.close();
    }
}
