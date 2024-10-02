public class bubbleSort {
    public static void main(String arge[]){
        int arr[]={7,6,6,3,4,8,9,10};

        for(int i=1; i<arr.length;i++){
            for(int j=0; j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.print (arr[i]+" ,");
        }
    }
}
