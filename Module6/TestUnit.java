import java.util.ArrayList;
import java.util.Random;

public class TestUnit {
    private static String printStudent(Student student) {
        return "Roll Number: " + student.rollNumber + "; " +
               "First Name: " + student.firstName + "; " +
               "Last Name: " + student.lastName;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("****Module 6 Testing Unit****");
        System.out.println("\n####Testing Student class");
        Student student1 = new Student(rand.nextInt(64),"Jason","Dibbert");
        Student student2 = new Student(rand.nextInt(64),"Augusta","Greenholt");
        Student student3 = new Student(rand.nextInt(64),"Ivah","Prohaska");
        Student student4 = new Student(rand.nextInt(64),"Cameron","O'Conner");
        Student student5 = new Student(rand.nextInt(64),"Allie","Goldner");
        Student student6 = new Student(rand.nextInt(64),"General","Rippin");
        Student student7 = new Student(rand.nextInt(64),"Haylie","Ledner");
        Student student8 = new Student(rand.nextInt(64),"Dedrick","Rutherford");
        Student student9 = new Student(rand.nextInt(64),"Brendan","Ledner");
        Student student10 = new Student(rand.nextInt(64),"Kirstin","Ebert");
        Student student11 = new Student(rand.nextInt(64),"Reta","Haley");
        Student student12 = new Student(rand.nextInt(64),"Rudy","Sipes");
        Student student13 = new Student(rand.nextInt(64),"Bernita","Zieme");
        Student student14 = new Student(rand.nextInt(64),"Jaiden","Lemke");
        Student student15 = new Student(rand.nextInt(64),"Norwood","Ruecker");
        Student student16 = new Student(rand.nextInt(64),"Cassidy","Reichert");
        Student student17 = new Student(rand.nextInt(64),"Ardith","Schaefer");
        Student student18 = new Student(rand.nextInt(64),"Sandra","Keeling");
        Student student19 = new Student(rand.nextInt(64),"Sarai","Jakubowski");
        Student student20 = new Student(rand.nextInt(64),"Jaeden","Terry");
        Student student22 = new Student(rand.nextInt(64),"Laron","Koelpin");
        Student student23 = new Student(rand.nextInt(64),"Camren","Stiedemann");
        Student student24 = new Student(rand.nextInt(64),"Jaunita","Romaguera");
        Student student25 = new Student(rand.nextInt(64),"Pete","Schmeler");
        Student student26 = new Student(rand.nextInt(64),"Arvid","Torp");        

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
        students.add(student22);
        students.add(student23);
        students.add(student24);
        students.add(student25);
        students.add(student26);

        /*int i = 1;
        while(i < students.size()) {
            System.out.println("Student " + (i + 1) + ":\n" + printStudent(students.get(i)));
            if(students.get(i).isGtRollNumber(students.get(i - 1))) {
                System.out.println("Student " + (i + 1) + " has a greater roll number than Student " + i);
            } else {
                System.out.println("Student " + (i + 1) + " has a lesser roll number than Student " + i);
            }
            i++;
        }*/

        System.out.println("####Testing StudentList class");
        StudentList studentList = new StudentList(students);
        System.out.println("Object was created.");
        
        System.out.println("\n####Sorted by roll number:");
        studentList.sortByRollNumber();
        for(Student student : studentList.students) {
            System.out.println(printStudent(student));
        }

        System.out.println("\n\n####Sorted by first name:");
        studentList.sortByFirstName();
        for(Student student : studentList.students) {
            System.out.println(printStudent(student));
        }

        System.out.println("\n\n####Sorted by last name:");
        studentList.sortByLastName();
        for(Student student : studentList.students) {
            System.out.println(printStudent(student));
        }
    }
}