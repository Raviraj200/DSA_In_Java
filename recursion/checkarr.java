import java.util.*;

/**
 * checkarr
 */
public class checkarr {
    public static void sort(int arr[],int size,int i){
        if(arr.length-1==i){
            System.out.println("Sort");

            return;
        }
        if(arr[i]<arr[i+1]){
            sort(arr, size, i+1);
            // System.out.println("Sort");
        }else{
            System.out.println("not sort");
        }
    }

    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,5};

        sort(arr,arr.length-1,0);
    }
}