public class javaques2 {
    public static void main(String[] args) {
        int n=13;
        for(int i=1; i<13; i++){
            for( int star=1; star<=n-i+1; star++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
