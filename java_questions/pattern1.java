// import java.util.*;

public class pattern1 {
    public static void hollow_rectangle(int totRows,int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            // inner columns
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j==1 || j == totCols){ // totrows = last rows and totcols = last cols
                        System.out.print("*");
                }
                else{
                       System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        // System.out.println("*****");
        // System.out.println("*   *");
        // System.out.println("*   *");
        // System.out.println("*****");
        hollow_rectangle(10,7);
        hollow_rectangle(15,15);
        hollow_rectangle(5, 4);
    }
}
