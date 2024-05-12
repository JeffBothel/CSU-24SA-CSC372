import java.util.ArrayList;

public class StudentList {
    public ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<Student>();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = new ArrayList<Student>();
        this.students.addAll(students);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

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
