import java.util.*;

// class forLoop{
//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();

//         for(int i=1;i<=10; i++){
//             System.out.println(i +"X"+n+"="+(i*n) );
//         }
//     }
// }

// class whileLoop{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         int n= sc.nextInt();
//          int i=1;
//         while(i<=10){
//             System.out.println(i +"X"+n+"="+(i*n) +"while loop");
//             i++;
//         }
//     }
// }


class forLoop{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
   int i=1;
        do{
            System.out.println(i +"X"+n+"="+(i*n) );
            i=i+1;

        }while(i<=10);
    }
}