// import java.util.*;

public class ArraysCC {
    public static void update(int marks[], int nonChangable){
        nonChangable = 51;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // int marks[] = new int[50];

        // int numbers[] = {1,2,3};

        // int morenumbers[] = {1,2,3,4,4,66};

        // String fruits[] = {"raja" , "khaja" , "bamd" , "baja"};

        int marks[] = {96,76,77,99};
        int nonChangable = 41;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        //print formarks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }

        System.out.println();
    }
}
