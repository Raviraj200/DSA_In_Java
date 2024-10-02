import java.util.*;
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
      
    // constructor**********************************
    Student(){
        System.out.println("Constructor called");
    }


    // Para-constructor******************************
    Student(String name, int age){
          this.name=name;
          this.age=age;
    }
}

public class ConStr {
    public static void main(String agr[]){
        Student s1=new Student("Ravi",22);
       
        s1.printInfo();
        

    }
}
