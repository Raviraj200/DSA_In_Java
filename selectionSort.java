public class selectionSort {
    public static void main(String arge[]){
        int arr[]={4,5,6,8,40,90,23,4};

        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                } 
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
