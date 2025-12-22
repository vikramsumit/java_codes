// Getter and Setter

import java.util.*;

public class parameter1 {

    private String name;
    private int rollNo;

    public parameter1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        String Name = "John Wick";
        int RollNo = 420;

        parameter1 student = new parameter1(Name, RollNo);


        System.out.println("--------------Value of Getter--------------");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
        
        
        student.setName("Bruce Wayne");
        student.setRollNo(101);
        
        System.out.println("------------Value after Setter-------------");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
    }
}
