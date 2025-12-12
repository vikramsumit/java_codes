public class oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("ajaseil");
        Student s3 = new Student(420);
        // Student s4 = new Student("rajklu", 420);

        // System.out.println(s1.name);
    }
}

class Student {
    String name; 
    int roll;

    Student() { 
        System.out.println("sjldkf;oie lkejoikd ejodiul.....");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }


}
