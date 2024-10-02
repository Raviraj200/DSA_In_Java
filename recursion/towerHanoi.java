import java.util.*;

/**
 * towerHanoi
 */
public class towerHanoi {
    public static void Hanoi(int n,String s,String h,String d){
        if(n==1){
            System.out.println(n+" from "+s+" to "+d);
            return ;
        }
        Hanoi(n-1, s, d, h);
        System.out.println(n+" from "+s+" to "+d);
        Hanoi(n-1, d, s, h );
    }

    public static void main(String age[]){
        Hanoi(3,"S","H","D");
    }
}