import java.util.*;

public class Merge_Sort {
    public static void con(int arr[],int s, int mid, int e){
        int newArr[]=new int[e-s+1];
        int x=0;
        int m=mid+1;
        while (s<=mid && m <=e) {
            if(arr[s]<=arr[e]){
                newArr[x++]=arr[s++];
            }else{
                newArr[x++]=arr[m++];
            }
        }
        while(s<=mid){
            newArr[x++]=arr[s++];

        }
        while(m<=e)
        newArr[x++]=arr[m++];
        {

        }
        for(int i=0,j=s; i<newArr.length;i++,j++){
            arr[j]=newArr[i];
        }
    }
    public static void div(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        div(arr,s,mid);
        div(arr, mid+1, e);
        con(arr,s,mid,e);
    }
    public static void main(String arge[]){
    int arr[]={4,2,5,6,3,1,7,8};
    int n=arr.length;
    div(arr,0,n-1);

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
