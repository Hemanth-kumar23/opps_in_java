
class StuInfo {

    String name;
    int age;

    // Copy constructor
    StuInfo(StuInfo original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Default constructor
    StuInfo() {
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class constructor {

    public static void main(String[] args) {
        // Create the first Student object
        StuInfo s1 = new StuInfo();
        s1.name = "John";
        s1.age = 21;

        // Create a copy of s1 using the copy constructor
        StuInfo s2 = new StuInfo(s1);

        // Display the details of both objects
        s1.displayInfo();
        s2.displayInfo();
    }
}
