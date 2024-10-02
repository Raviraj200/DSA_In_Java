// package objClass;

// class Two{
//     int year;
//     String model;

//     void print(int year,String model){
//         this.model=model;
//         this.year=year;
//     }
//    public String toString(){
//     return "car model is "+model+" and"+" car year is "+year;
//    }
// }
// public class one {
// public static void main(String ags[]){
//      Two obj = new Two();
//      obj.print(50, "oh");
//      System.out.println(obj.toString());
// }
    
// }


package OOP.objClass;
import java.util.*;
/**
 * one
 */
public class one {

    public static void main(String ags[]){
         List<Integer> list = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
         for(int n, i=0; i<5; i++){
               n=sc.nextInt();
                list.add(n);

         }
         for(int i =0 ;i<5; i++){
            System.out.println(list.get(i));
         }
    }
}