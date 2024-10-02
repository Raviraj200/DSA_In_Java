// import java.util.*;

// class arrya{
//     public static void main(String arge[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a arrya size");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             System.out.println("Enter element number"+i);
//             arr[i]=sc.nextInt();

//         }
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }












// import java.util.*;

// class arrya{
//     public static void main(String arge[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int arr[]=new int[n];


//         for(int i=0; i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Enter the find element");
//         int input=sc.nextInt();
//         for(int i=0; i<arr.length; i++){
//             if(input==arr[i]){
//                 System.out.println("Output is"+i);
//             }

//         }
//     }
// }





// 2Darrya

import java.util.*;

class arrya{
    public static void main(String arge[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("size of row");
        int row=sc.nextInt();
        System.out.println("size of col");

        int col=sc.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }

        }
        System.out.println("Enter the find number");
        int find = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==find){
                System.out.print(i+","+j+" ");

                }
            }
            System.out.println();
        }
    }
}