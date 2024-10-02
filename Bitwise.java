import java.util.*;

/**
 * Bitwise
 */
public class Bitwise {

    public static void main(String arge[]){
        int n=5;
        int pos=3;
        int bitMask = 1<<pos;

        if((bitMask & n) ==0){
               System.out.println("Bit  was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
}