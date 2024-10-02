// import java.util.*;

// class pattern{
//     public static void main(String[] agrs){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if(j==1 || j==n || i==1||i==n){

//                     System.out.print("* ");
//                 }
//                 else{
//                     System.err.print("  ");
//                 }

//             }
//            System.out.println(" ");

//         }
//     }
// }

// import java.util.*;

// class pattern{
//     public static void main( String[] sarg){
//         Scanner sc = new Scanner(System.in);
//         int num= sc.nextInt();

//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.*;

// class pattern{

//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();
//         for(int i=num;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }



// import java.util.*;

// class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         int num = sc.nextInt();
//        for(int i=1; i<=num; i++){
//              for(int j=1;j<=num-i;j++){
//                 System.out.print(" ");
//              }
//              for(int j=1;j<=i;j++){
//                 System.out.print("*");
//              }
//              System.out.println("");
//        }
//     }
// }




// import java.util.*;

// class pattern{
//     public static void main(String[] agrs){
//         Scanner sc =new Scanner(System.in);
//         int num= sc.nextInt();

//         for(int i=1; i<=num; i++){
//             for(int j=1;j<=i; j++){
//                 System.out.print(j);

//             }
//             System.out.println("");
//         }
//     }
// }



// import java.util.*;

// class pattern{
//     public static void main(String[] agrs){
//         Scanner sc= new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=num-i+1; j++){
//                    System.out.print(j+ " ");
//             }
//             System.out.println("");
//         }
//     }
// }

// output
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1



// import java.util.*;

// class pattern{
//     public static void main(String[] sarg){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();
//         int n=1;
//         for(int i=1; i<=num; i++){
//             for(int j=1;j<=i; j++){
//                 System.out.print(n);
//                 n++;
//             }
//             System.out.println(" ");
//         }

//     }
// }

// output
// 1
// 23
// 456
// 78910


// import java.util.*;
// class pattern{
//         public static void main(String[] sarg){
//             Scanner sc= new Scanner(System.in);
//             int num= sc.nextInt();
            
//             for(int i=1; i<=num; i++){
//                 for(int j=1;j<=i; j++){
//                    if((i+j)%2==0){
//                     System.out.print("1");
//                    }else{
//                     System.out.print("0");
//                    }
                    
//                 }
//                 System.out.println(" ");
//             }
    
//         }
//     }

//     output
// 1
// 01
// 101
// 0101
// 10101





// import java.util.*;

// class pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();

//         for(int i=1;i<=num; i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");

//             }
//             int spaces = 2*(num-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int n=1; n<=i;n++){
//                 System.out.print("*");

//             }
//             System.out.println("");
//         }
//         for(int i=num;i>=1; i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");

//             }
//             int spaces = 2*(num-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int n=1; n<=i;n++){
//                 System.out.print("*");

//             }
//             System.out.println("");
//         }
//     }
// }

// output
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *



// import java.util.*;

// class pattern{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();

//         for(int i=1; i<=num;i++){
//               for(int j=1; j<=num-i; j++){
//                 System.out.print("  ");
//               }
//               for(int j=1; j<=num; j++){
//                 System.out.print("* ");
//               }
//               System.out.println("");

//         }
//     }
// }
// output
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *




// import java.util.*;

// class pattern{
//     public static void main(String[] arge){
//         Scanner sc= new Scanner(System.in);
//         int num= sc.nextInt();

//         for(int i=1 ;i<=num; i++){
//             for(int j=1; j<=num-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i);
//                 System.out.print(" ");

//             }
//             System.out.println();

//         }

//     }
// }
// output
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5




// class pattern{
//     public static void main(String[] arge){
//         for(int i=1; i<=5; i++){
//             for(int j=5-i ;j>=1; j--){
//                 System.out.print(" ");
//             }
//             for(int k=i;k>=1;k--){
//                 System.out.print(k);
           

//             }
//           for(int j=2;j<=i;j++){
//             System.out.print(j);
//           }
//   System.err.println();
//         }
//     }
// }
// output
//     1
//    212
//   32123
//  4321234
// 543212345





