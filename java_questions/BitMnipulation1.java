// import java.util.*;

public class BitMnipulation1 {
    public static void oddoreven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static int getithBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask)== 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        oddoreven(555);
        oddoreven(556);
        System.out.println(getithBit(0, 0));
    }
    
}
