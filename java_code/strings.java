import java.util.*;

public class strings {
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = { 'a' , 'b' ,'c','d','e'};
        // String str = "abcd";
        // String str2 = new String("xyz@456bahubali");
        
        // //strings are immutable i.e it cannot be changed

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark and THOR are most powerful";
        // System.out.println(fullName.length());

        //concatenation
        String firstName = "Sumit";
        String lastName = "Vikram";
        String otherName = "student";
        String fullName = firstName + " " + lastName + " " + otherName;
        // System.out.println(fullName + "is this");
        System.out.println(fullName.charAt(9));
        printletters(fullName);
        
    }
}
