
class MyStudent {

    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    MyStudent(MyStudent natty) {
        this.name = natty.name;
        this.age = natty.age;

    }

    MyStudent() {

    }

}

public class raj {

    public static void main(String[] args) {
        MyStudent s1 = new MyStudent();
        s1.name = "ram";
        s1.age = 17;

        MyStudent s2 = new MyStudent(s1);
        s1.printinfo();
        s2.printinfo();
    }
}
