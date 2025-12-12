import java.util.*;

public class newprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("number daal:");
    int userInput = sc.nextInt();

    Primenochek number = new Primenochek(userInput); 

    if (number.isPrime()){
        System.out.println(userInput + " yes it is");
    }
    else {
        System.out.println(userInput + " No it's not");
    }

    sc.close();
    }
    
}

class Primenochek {
    private int number; 

    public Primenochek(int number) {
        this.number = number;
    }

     public boolean isPrime(){
        if(this.number ==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(this.number); i++){
            if(this.number % i ==0) {
                return false;
            }
        }
        return true;
     }
}
// import java.util.*;

// public class newprime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int userInput = sc.nextInt();

//         Primenochek number = new Primenochek(userInput); 

//         if (number.isPrime()){
//             System.out.println(userInput + " is prime");
//         }
//         else {
//             System.out.println(userInput + " is not prime");
//         }

//         // sc.close(); // Close the scanner
//     }
// }

// class Primenochek {
//     private int number; 

//     public Primenochek(int number) {
//         this.number = number;
//     }

//     public boolean isPrime(){
//         if(this.number == 2){
//             return true;
//         }
//         if(this.number < 2 || this.number % 2 == 0){
//             return false;
//         }
//         for(int i=3; i<=Math.sqrt(this.number); i+=2){
//             if(this.number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
