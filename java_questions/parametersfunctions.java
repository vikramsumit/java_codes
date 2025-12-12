import java.util.*;

public class parametersfunctions {
    public static int caculatesum(int num1, int num2){ //parameters or forma;l parameters
        
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = caculatesum(a,b);   //arguments or actual parameters
        System.out.println("sum is  :" + sum);
    }
}
