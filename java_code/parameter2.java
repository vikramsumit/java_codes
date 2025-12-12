import java.util.*;

class meme {
    private String name;
    private int rollNo;

    public meme(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class parameter2 {
    public static void main(String[] args) {
        String studentName = "Raju bhai";
        int studentRollNo = 65464;

        meme student = new meme(studentName, studentRollNo);


        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
    }
}
