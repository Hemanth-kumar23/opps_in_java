// // first method in absrtaction = which is normal absraction 
// abstract class Animaal {

//     abstract void walk();
// }
// class horse extends Animaal {
//     public void walk() {
//         System.out.println("walks on four legs ");
//     }
// }
// class chicken extends Animaal {
//     public void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }
// public class abstraction {
//     public static void main(String[] args) {
//         horse h1 = new horse();
//         h1.walk();
//     }
// }
//second method in absrtaction = where we are using interface concepts 
interface Animal {

    public void walk();
}

interface Herbivors {

    void eat();

}

class horse implements Animal, Herbivors {

    public void walk() {
        System.out.println("walks on 4 legs ");
    }

    public void eat() {
        System.out.println("eats only veg");
    }
}

public class abstraction {

    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
        h1.eat();
    }
}
