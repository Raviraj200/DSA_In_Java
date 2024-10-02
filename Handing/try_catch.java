package Handing;

public class try_catch {
    public static void main(String ags[]){
        int arr[]= new int[5];

        try{
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array length out of bounds ");
            System.out.println(e.getMessage());
        }

        System.out.println("after try catch");
    }
}
