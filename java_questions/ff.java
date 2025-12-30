import java.util.*;

// Helper class that accesses another class object
class FriendClass {

    // Static method that receives ff object
    public static void friendFunction(ff obj) {
        System.out.println("Friend function called");
        System.out.println("x in ff: " + obj.x); // Accessing variable
    }
}

public class ff {

    int x = 10; // Instance variable

    void myMethod() {
        System.out.println("myMethod called");
        FriendClass.friendFunction(this); // Passing current object
    }

    public static void main(String[] args) {
        ff obj = new ff(); // Create object of ff
        obj.myMethod();   // Call method
    }
}
