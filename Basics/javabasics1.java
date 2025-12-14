// Area of circle

import java.util.Scanner;

public class javabasics1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float rad = scan.nextFloat();
        // float raj = scan.nextFloat(); // This line use to take i/p

        double area = 3.14 * rad * rad;
        double circumference = 2 * 3.14 * rad;

        System.out.println("Area of circle is: \n" + area);
        System.out.println("Total curcumference is: \n" + circumference);

        scan.close();
    }

}
