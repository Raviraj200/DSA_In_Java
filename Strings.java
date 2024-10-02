// import java.util.*;
// public class Strings {
//     public static void main(String argee[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();

//         System.out.println("My name is:"+name);
//         for(int i=0;i<name.length();i++){
//          System.out.println(name.charAt(i));
//         }
//         };

// }

// compareto******************************************

// import java.util.*;

// import org.w3c.dom.TypeInfo;

// /**
//  * Strings
//  */
// public class Strings {

//     public static void main(String arge[]){
// Scanner sc= new Scanner(System.in);

// String name1=sc.nextLine();
// String name2 =sc.nextLine();

// if(name1.compareTo(name2)==0){
//     System.out.println("String are equl");
// }else{
//     System.out.println("Not equl");
// }

// if(new String("Ravi")==new String("Ravi")){
//     System.out.println("equl");

// }else{
//     System.out.println("not Equl");
// }

// String name ="Ravi raj singh thakur";
// System.out.println(name.substring(1,10  ));

// parseInt()
// String num ="123";
// int newNum=Integer.parseInt(num);

//  StringBuilder
// StringBuilder sb =new StringBuilder("Ravi");
// System.out.println(sb);
// sb.setCharAt(0, 'r');
// System.out.println(sb);

// insert

// StringBuilder sb = new StringBuilder("Ravi");
// sb.insert(4, "raj");
// sb.delete(0,2);
// sb.append("raj");
// sb.deleteCharAt(0);
// sb.replace(0, 2,"r");
// System.out.println(sb);

//     }
// }

// reves*******************************

// import java.util.*;. 

public class Strings {

    public static void main(String arge[]) {
        StringBuilder sc = new StringBuilder("Ravi");

        for (int i = 0; i <= sc.length(); i++) {
            int front = i;

            int back = sc.length() - 1 - i;

            char f = sc.charAt(front);
            char b = sc.charAt(back);

            sc.setCharAt(f, b);
            

        }
        System.out.println(sc);
    }
}