import java.util.ArrayList;

public class TestUnit {
    public static void main(String[] args) {
        System.out.println("Module 6 Testing Unit");
        System.out.println("Testing Student class");
        Student student1 = new Student();
        Student student2 = new Student(1, "Jane", "Doe");
        Student student3 = new Student(2, "Alice", "Smith");
        Student student4 = new Student(3, "Bob", "Johnson");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("First Name: " + student.firstName);
            System.out.println("Last Name: " + student.lastName);
            System.out.println("Email: " + student.email);
            System.out.println("Phone: " + student.phone);
            System.out.println("Address: " + student.address);
            System.out.println("City: " + student.city);
            System.out.println("State: " + student.state);
            System.out.println("Zip: " + student.zip);
            System.out.println("Country: " + student.country);
            System.out.println();
        }
    }
}