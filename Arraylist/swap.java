public class swap {
    public static void swap(int a, int b, int c){
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    public static void main(String[] args) {
        int a = 534;
        int b = 254;
        int c = 354;

        swap(a, b, c);
    }
}
