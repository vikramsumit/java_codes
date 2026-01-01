import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        // int age = 8;

        // if(age >=18)
        // {
        // System.out.println("Legal Adult");
        // }
        // else
        // {
        // System.out.println("You are a kid baby");
        // }

        // int age=118;

        // if(age>=18 && age<60)
        // {
        // System.out.println("You are an adult i.e bada baccha");
        // }
        // else if(age>=60 && age<=100)
        // {
        // System.out.println("you're an old man");
        // }
        // else if(age>=100 && age<=120)
        // {
        // System.out.println("Kya khate ho bhudao");
        // }
        // else if(age>120)
        // {
        // System.out.println("JHOOT MAT BOL");
        // }
        // else
        // {
        // System.out.println("you're still a kid baby");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        // int age = -2;

        if (age >= 18 && age <= 60) {
            if (age > 20 && age < 30) {
                System.out.println("You're in 20's");
            } else if (age >= 30 && age <= 40) {
                System.out.println("You're in 30's");
            } else {
                System.out.println("you are still teen");
            }
        } else if (age > 60 && age <= 120) {
            System.out.println("you are an old man");
        } else if (age >= 120) {
            System.out.println("i am gonna call 112 ");
        } else if (age >= 16 && age <= 18) {
            System.out.println("you are teenager");
        } else if (age < 16 && age >= 0) {
            System.out.println("you are still a child");
        } else {
            System.out.println("Fake mt bsdk");
        }
    }
}
