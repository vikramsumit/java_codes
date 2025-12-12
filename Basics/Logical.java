public class Logical 
{
 public static void main(String[] args) {
    
    int a=10;
    int b=20;
    int c=30;
    System.out.println(a==b && a<b && a<c);
    System.out.println(a<b && a<c && a<=c);
    System.out.println(a==b || a<b || a>b);
    System.out.println(a==b || a<b || a<b);
    System.err.println(!true);

 }   
}
