import java.util.*;
/**
 * printx
 */
public class printPower {
    public static int printPow(int x,int y){
             if(x==0){
                return 0;
             }
             if(y==0){
                return 1;
             }
             
             int power=printPow(x, y-1);
             int pow=power*x;
             return pow;


    };

    public static void main(String arg[]){
        int p=printPow(2, 5);
        System.out.println(p);
    }
}