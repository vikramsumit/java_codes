import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String fullName, gender, dob, contactNumber, email, address, nationality, bloodGroup;
    String rollNumber, course, specialization, admissionCategory, fatherName, motherName;
    String hostelDetails = "N/A";
    double cgpa;

    public Student(String fullName, String gender, String dob, String contactNumber, String email, String address,
            String nationality, String bloodGroup, String rollNumber, String course,
            String specialization, String admissionCategory, String fatherName,
            String motherName, String hostelDetails, double cgpa) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
        this.bloodGroup = bloodGroup;
        this.rollNumber = rollNumber;
        this.course = course;
        this.specialization = specialization;
        this.admissionCategory = admissionCategory;
        this.fatherName = fatherName;
        this.motherName = motherName;
        if (!hostelDetails.isEmpty()) {
            this.hostelDetails = hostelDetails;
        }
        this.cgpa = cgpa;
    }
}

public class StudentRecordLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Validate number of students input
        int n = 0;
        while (true) {
            System.out.println("Enter number of students:");
            String input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if (n > 0)
                    break;
                else
                    System.out.println("Please enter a positive integer.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Date of Birth (DD/MM/YYYY): ");
            String dob = sc.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = sc.nextLine();

            System.out.print("Email Address: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Nationality: ");
            String nationality = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            System.out.print("Roll Number: ");
            String rollNumber = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Admission Category: ");
            String admissionCategory = sc.nextLine();

            System.out.print("Father's Name: ");
            String fatherName = sc.nextLine();

            System.out.print("Mother's Name: ");
            String motherName = sc.nextLine();

            System.out.print("Hostel Details (leave empty if not applicable): ");
            String hostelDetails = sc.nextLine();

            double cgpa = 0.0;
            while (true) {
                System.out.print("CGPA: ");
                String cgpaInput = sc.nextLine();
                try {
                    cgpa = Double.parseDouble(cgpaInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value for CGPA.");
                }
            }

            students.add(new Student(fullName, gender, dob, contactNumber, email, address, nationality,
                    bloodGroup, rollNumber, course, specialization, admissionCategory,
                    fatherName, motherName, hostelDetails, cgpa));
        }

        System.out.println("\nStudent Details:");
        System.out.printf("%-20s %-8s %-12s %-15s %-25s %-15s %-12s %-10s %-10s %-12s %-12s %-15s %-15s %-15s %-10s\n",
                "Full Name", "Gender", "DOB", "Contact", "Email", "Address",
                "Nationality", "Blood", "Roll No.", "Course", "Spec.",
                "Adm. Cat.", "Father", "Mother", "CGPA");

        for (Student student : students) {
            System.out.printf(
                    "%-20s %-8s %-12s %-15s %-25s %-15s %-12s %-10s %-10s %-12s %-12s %-15s %-15s %-15s %-10.2f\n",
                    student.fullName, student.gender, student.dob, student.contactNumber, student.email,
                    student.address, student.nationality, student.bloodGroup, student.rollNumber,
                    student.course, student.specialization, student.admissionCategory,
                    student.fatherName, student.motherName, student.cgpa);
        }

        sc.close();
    }
}
