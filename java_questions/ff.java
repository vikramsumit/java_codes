// Friend Function — Definition

// A friend function is a function that is not a member of a class, but it is allowed to access the private and protected members of that class.

// 👉 Friend functions are mainly used in C++ (they do not exist in Java).

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
        obj.myMethod(); // Call method
    }
}
