// import java.util.*;

// public class Rectangle66 {
//     public static void main(String[] args) {
//     //     Scanner scanner = new Scanner(System.in);

//     //    System.out.println("Enter the length of rectangle:");

  
//             Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the length of rectangle:");
//         double length = scanner.nextDouble();

//         System.out.println("Enter the width of rectangle:");
//         double width = scanner.nextDouble();

//         // Rectangle66 myRectangle = new Rectangle66(length, width);

//         System.out.println("Length: " + myRectangle.getLength());
//         System.out.println("Width: " + myRectangle.getWidth());
//         System.out.println("Area: " + myRectangle.calculateArea());
//         System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
//     }

//     public class Rectangle {
//         private double length;
//         private double width;
    
//         public Rectangle(double length, double width) {
//             this.length = length;
//             this.width = width;
//         }
    
//         public double getLength() {
//             return length;
//         }
    
//         public void setLength(double length) {
//             this.length = length;
//         }
    
//         public double getWidth() {
//             return width;
//         }
    
//         public void setWidth(double width) {
//             this.width = width;
//         }
    
//         public double calculateArea() {
//             return length * width;
//         }
    
//         public double calculatePerimeter() {
//             return 2 * (length + width);
//         }
    
//     }
    
    
// }
import java.util.*;

public class Rectangle66 {
    private double length;
    private double width;

    public Rectangle66(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of rectangle:");
        double width = scanner.nextDouble();

        Rectangle66 myRectangle = new Rectangle66(length, width);

        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}
