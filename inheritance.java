// // 1) basic example of inheritance
// class shape {
//     String color;
// }

// class Trinangle extends shape {
// }
// public class inheritance {
//     public static void main(String[] args) {
//         Trinangle t1 = new Trinangle();
//         t1.color = "blue";
//         System.out.println(t1.color);
//     }
// }
// // 2) types of inheritance
class shape {

    public void area() {
        System.out.println("shows area");
    }
}

class trinagle extends shape { //1) it is for single level inheritance we have added this class

    public void area(int l, int b) {
        System.out.println(1 / 2 * l * b);
    }

}

class EqualateralTriangle extends trinagle { // 2) it is for multilevel inheritance we have added this class

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

}

class cirlcle extends shape { // hierachial inheritance means taking one sub class which is drived multiple classes 

    public void area(int r) {
        System.out.println(3.14 * r * r);

    }
}

public class inheritance {

    public static void main(String[] args) {
        cirlcle c = new cirlcle();
        c.area(5);

    }

}
