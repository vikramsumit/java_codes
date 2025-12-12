import java.util.*;

public class javabasics4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your required no:");
            int n = sc.nextInt();

            if (n % 13 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

        System.out.println("Ab ruk ja bhai");
    }
}
