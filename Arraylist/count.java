import java.util.ArrayList;

public class count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(78);
        list.add(564);
        list.add(5);
        list.add(45);

        System.out.println(list.size());

        System.out.println("Required list are:" );

        for(int i = 0; i<list.size(); i++ ){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nReverse arraylist is: ");
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

        int max = 0; 
        for(int i = 0; i <list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        System.out.println("\nmax element is: " + max);
    }
}
