class pen{
    String color;
    String type; 
    public void write(){
        System.out.println("wrirting something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

public class obj {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type ="ball";

        pen1.printcolor();
        pen2.printType();


        
    }    
}
