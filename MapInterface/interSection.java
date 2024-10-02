package MapInterface;

import java.util.HashSet;

/**
 * interSection
 */
public class interSection {
    public static void InterSet(int arr[], int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<arr.length; i++) set.add(arr[i]);
        int count=0;
        for(int i=0;i<arr2.length; i++){
             if(set.contains(arr2[i])){
                System.out.print(arr2[i]+"->");
                count++;
                set.remove(arr2[i]);
             }
        }
        
      System.out.println("\ncount->"+count);
    }

    public static void main(String[] args) {
        int arr[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        InterSet(arr,arr2);
    }
}