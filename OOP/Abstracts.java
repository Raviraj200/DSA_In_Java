

abstract class Animal {
    abstract void walk();
};

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
         public void walk(){
            System.out.println("walks on 2 legs");
         }
}

public class Abstracts {
    public static void main(String agr[]) {
        Horse h1 = new Horse();
        h1.walk();
        
    }
}
