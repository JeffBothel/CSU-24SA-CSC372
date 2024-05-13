import java.util.ArrayList;

public class StudentList {
    public ArrayList<Student> students;

    // Default constructor
    public StudentList() {
        this.students = new ArrayList<Student>();
    }

    // Constructor with a single student
    public StudentList(Student student) {
        this.students = new ArrayList<Student>();
        this.students.add(student);
    }

    // Constructor with an array of students
    public StudentList(Student[] students) {
        this.students = new ArrayList<Student>();
        for (Student student : students) {
            this.students.add(student);
        }
    }

    // Constructor with an ArrayList of students
    public StudentList(ArrayList<Student> students) {
        this.students = new ArrayList<Student>();
        this.students.addAll(students);
    }

    // Add a student to the list
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Remove a student from the list
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    // Remove a student from the list by index
    public void sortByRollNumber() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = i + 1; j < this.students.size(); j++) {
                if (this.students.get(i).isGtRollNumber(this.students.get(j))) {
                    Student temp = this.students.get(i);
                    this.students.set(i, this.students.get(j));
                    this.students.set(j, temp);
                }
            }
        }
    }

    // Sort the list by first name
    public void sortByFirstName() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = i + 1; j < this.students.size(); j++) {
                if (this.students.get(i).isGtFirstName(this.students.get(j))) {
                    Student temp = this.students.get(i);
                    this.students.set(i, this.students.get(j));
                    this.students.set(j, temp);
                }
            }
        }
    }

    // Sort the list by last name
    public void sortByLastName() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = i + 1; j < this.students.size(); j++) {
                if (this.students.get(i).isGtLastName(this.students.get(j))) {
                    Student temp = this.students.get(i);
                    this.students.set(i, this.students.get(j));
                    this.students.set(j, temp);
                }
            }
        }
    }
}
