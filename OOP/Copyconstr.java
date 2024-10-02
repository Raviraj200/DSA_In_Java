import java.util.*;

class Copy{
    String name;
    int age;

    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age
        );
    }
    Copy(Copy c2){
        
        this.name=c2.name;
        this.age=c2.age;
    }
    Copy(){

    }
}
public class Copyconstr {
     public static void main(String agr[]){
        Copy c1=new Copy();
        c1.name="Ravi";
        c1.age=22;

        Copy c2=new Copy(c1);
        c2.Info();
     }
    
}