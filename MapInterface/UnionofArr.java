package MapInterface;

import java.util.HashSet;

/**
 * UnionofArr
 */
public class UnionofArr {
    public static int Union(int arr[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<arr.length; i++) set.add(arr[i]);
        for(int i=0; i<arr2.length; i++) set.add(arr2[i]);
        return set.size() ;
    }
    public static void main(String[] args) {
        int arr[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(Union(arr, arr2));
        
    }
}