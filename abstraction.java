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
//         chicken h1 = new chicken();
//         h1.walk();
//         horse h2 = new horse();
//         h2.walk();
//     }
// }
//second method in absrtaction = where we are using interface concepts 
interface Animal {

    public void walk();
}

interface Herbivors {

    void eat();
}

interface RunFast {

    void run();
}

class horse implements Animal, Herbivors, RunFast {

    public void walk() {
        System.out.println("walks on 4 legs ");
    }

    public void eat() {
        System.out.println("eats only veg");
    }

    public void run() {
        System.out.println("the horse can run faster");
    }
}

public class abstraction {

    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
        h1.eat();
        h1.run();
    }
}
