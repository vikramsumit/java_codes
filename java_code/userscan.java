import java.util.Scanner;

public class userscan {
    public static void main(String[] args) {

                Scanner scan=new Scanner(System.in);
                System.out.println("Enter a number");
                int age=scan.nextInt();

                System.out.println("Required Number is "+ age);

                System.out.println("Enter the average");
                double avg=scan.nextDouble();

                System.out.println("Avg is" + avg);

                System.out.println("Enter the name");
                String name= scan.next();
                
            //this will take all input as one line and store it in string variable called "name".
                System.out.println("The Beautiful Name is" + name);
    }
}
