import java.util.*;

class sumnaturalNumber{
    public static void main(String[] agrs){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
          int sum=0,i=1;
     while(i<=n){
        sum=sum+i;
        i++;

     }
        System.out.println(sum);
    }
}