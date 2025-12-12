// public class oops3 {
//     public static void main(String[] args) {
//         Horse h = new Horse();
//         h.eat();
//         h.walk();
//         System.out.println(h.color);
        

//         chicken c = new chicken();
//         c.eat();
//         c.walk();

//     //     Animal a = new Animal() {
            
//     //     };
//      }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         color = "brown";
//     }
//     void eat() {
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     void changecolor() {
//         color = "Dark brown";
//     }

//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class chicken extends Animal {
//     void changecolor() {
//         color = "Dark red";
//     }
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
public class oops3 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        super(); // This is called automatically, but it's good practice to include it.
        color = "Dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        super(); // This is called automatically, but it's good practice to include it.
        color = "Dark red";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
