import java.util.Scanner;

class Pen{
    String color;
    String type;

    public void write(String color, String type){
        System.out.println("Write something  "+color+" "+" "+type);
    }

    public void print(){
        System.out.println(this.color);
    }
}
public class Oops{
    public static void main(String agr[]){
   Pen pen1=new Pen();
   pen1.color="blue";
   pen1.type="gel";

   Pen pen2= new Pen();
   pen2.color="black";
   pen2.type="gel";

  pen1.print();
  pen2.print();

    }
}