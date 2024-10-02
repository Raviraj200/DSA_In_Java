import java.util.*;
public class StrRev {
    public static void rev(String a,int n){
        if(n==0){
        System.out.print(a.charAt(n));

            return;
        };
     
        System.out.print(a.charAt(n));
        rev(a, n-1);
    }
    public static void main(String arg[]){
        String a="ravi";
    
        rev(a,a.length()-1);
    }
}
