
class Student {

    String name;
    int age;

    // Copy constructor
    Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Default constructor
    Student() {
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class main {

    public static void main(String[] args) {
        // Create the first Student object
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 21;

        // Create a copy of s1 using the copy constructor
        Student s2 = new Student(s1);

        // Display the details of both objects
        s1.displayInfo();
        s2.displayInfo();
    }
}
