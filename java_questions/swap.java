//SWAP VALUE EXCHANGE

public class swap {
    public static void swap(int a, int b) {
        
        int temopu=a;
        a=b;
        b=temopu;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
    public static void main(String[] args) {
        int a=55;
        int b=44;
        swap(a,b);
        
    }
}
