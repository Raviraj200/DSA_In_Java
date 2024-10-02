import java.util.*;

public class Quick_Sort {
    public static int paitition(int arr[], int low, int high) {
        int piovt = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[high]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;

    };

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int piId = paitition(arr, low, high);
            quickSort(arr, low, piId - 1);
            quickSort(arr, piId + 1, high);
        }
    }

    public static void main(String agr[]) {
        int arr[] = { 1, 2, 3, 4, 56, 9, 8, 7 };
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        for(int i=0; i<high+1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}


