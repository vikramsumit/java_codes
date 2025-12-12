
import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the month number
        System.out.print("Enter the number of the month (1-12): ");
        
        // Read the input from the user
        int monthNumber = sc.nextInt();

        // Close the scanner
        sc.close();

        // Call the method to get the month name
        String monthName = getMonthName(monthNumber);

        // Print the month name
        System.out.println("The month is: " + monthName);
    }

    // Method to convert month number to month name
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month number";
        }
    }
}
