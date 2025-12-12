public class oops2 {
    public static void main(String[] args) {
        // Fish whales = new Fish();
        Fish whales = new Fish();
        whales.eat();
         whales.swim();
    }
}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}
    //Derived class /sub class
    class Fish extends Animal {
        int fins;

        void swim() {
            System.out.println("Swims in water");
        }
    }

// // Base class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// // Derived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims in water");
//     }
// }

// // Main class
// public class oops2 {
//     public static void main(String[] args) {
//         Fish whales = new Fish();
//         whales.eat();
//         whales.swim();
//     }
// }
