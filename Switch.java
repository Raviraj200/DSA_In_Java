import java.util.*;

/**
 * Switch
 */
public class Switch {

    public static void main(String arg[]){
        int arr[]= {10,20,30,40,50,60,70,80,90};
        int arrlen= arr.length-1;
        for(int i=0; i<=arrlen; i++){
            int temp = arr[i];
            arr[i]=arr[arrlen];
            arr[arrlen]=temp;
            arrlen--;
        }
        for(int i=0; i<=arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}