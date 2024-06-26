public class Student {
    public int rollNumber;
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String country;

    // Default constructor
    public Student() {
        this.rollNumber = 0;
        this.firstName = "John";
        this.lastName = "Doe";
        this.email = "john.doe@notrealy.com";
        this.phone = "123-456-7890";
        this.address = "123 Main St";
        this.city = "Anytown";
        this.state = "CA";
        this.zip = "12345";
        this.country = "USA";
    }

    // Constructor with roll number
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.firstName = "John";
        this.lastName = "Doe";
        this.email = "john.doe@notrealy.com";
        this.phone = "123-456-7890";
        this.address = "123 Main St";
        this.city = "Anytown";
        this.state = "CA";
        this.zip = "12345";
        this.country = "USA";
    }

    // Constructor with roll number and name
    public Student(int rollNumber, String firstName, String lastName) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = "john.doe@notrealy.com";
        this.phone = "123-456-7890";
        this.address = "123 Main St";
        this.city = "Anytown";
        this.state = "CA";
        this.zip = "12345";
        this.country = "USA";
    }
    
    // Constructor with all fields
    public Student(int rollNumber, String firstName, String lastName, String email, String phone, String address, String city, String state, String zip, String country) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    // Comparator methods for objects
    public boolean isGtRollNumber(Student student) {
        return this.rollNumber > student.rollNumber;
    }

    // Comparator methods for objects
    public boolean isEqRollNumber(Student student) {
        return this.rollNumber == student.rollNumber;
    }

    // Comparator methods for objects
    public boolean isGtFirstName(Student student) {
        return this.firstName.compareTo(student.firstName) > 0;
    }

    // Comparator methods for objects
    public boolean isEqFirstName(Student student) {
        return this.firstName.compareTo(student.firstName) == 0;
    }

    // Comparator methods for objects
    public boolean isGtLastName(Student student) {
        return this.lastName.compareTo(student.lastName) > 0;
    }

    // Comparator methods for objects
    public boolean isEqLastName(Student student) {
        return this.lastName.compareTo(student.lastName) == 0;
    }
}