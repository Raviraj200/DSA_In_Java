// import java.util.Scanner;

// public class Function {
//     public static void nnn(int n){
//    System.out.println(n);
//    return;
//     }
//     public static void main(String[] agsr){
//         Scanner sc = new Scanner(System.in);
//         int num=sc.nextInt();
//         nnn(num);

//     }
// }

// sum two number

// import java.util.*;

// class Function{
//     public static int sum(int n,int m){
//           return n+m;
//     }
//     public static void main(String[] arge){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();

//         System.out.println(sum(num1,num2));
//     }
// }

// factorial
import java.util.*;

class Function {
    public static int sum(int n) {
        if (n < 0) {
          
            return 0;
        }
        int m = 1;
        for (int i = n; i >= 1; i--) {
            m = m * i;
        }
        return m;
    }

    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println(sum(num1));
    }
}