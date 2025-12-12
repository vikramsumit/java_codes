// Area of circle

import java.util.*;

public class javabasics1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float rad = scan.nextFloat();
        double area = 3.14 * rad * rad;
        double circumference = 2 * 3.14 * rad;

        System.out.println(area);
        System.out.println(circumference);

        scan.close();
    }

}
