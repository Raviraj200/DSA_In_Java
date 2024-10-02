// Inheritance***************************************************

import java.util.*;

class first{
    String name;

    public void Info(){
        System.out.println(this.name);
    }
}

class Second extends first{

}


// Multi level Inheritance*********************************************

class Shape{
    public void area(){
        System.out.println("diaplays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}


// Hierarchial Inheritance******************************************

class Shapes{
    public void area(){
        System.out.println("diaplays area");
    }
}
class Triangles extends Shapes{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangles extends Shapes{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}

public class Inheritance {
  public static void main(String arg[]){
     Second s1=new Second();
     s1.name="ravi";    
     s1.Info(); 
  }
    
}