import java.util.*;

/**
 * fibonacei
 */
public class fibonacei {
    public static void fibNu(int a,int b,int sum){
       int c;

       if(sum==0){
             return;
       }
       c=a+b;
       System.out.println(c);
       fibNu(b, c, sum-1);

    }
public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int a=0;
    int b=1;
    int sum=1;
    System.out.println(a);
    System.out.println(b);

    fibNu(a,b,num-2);
}
    
}