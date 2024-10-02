import java.util.*;
/**
 * invitePeople
 */
public class invitePeople {
   public static int find(int n){
    if(n<=1){
        return 1;
    }
         int way1=find(n-1);

         int way2=(n-1)*find(n-2);

         return way1+way2;
   }

    public static void main(String age[]){
        int n=4;
        System.out.println(find(n));
    }
}






// public class invitePeople {
//     public static void find(int n){
//         int count=0;
//          for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 count++;
//             }
//          }
//          System.out.println(count+n);
//     }
//      public static void main(String agr[]){
//         int n=4;
//         find(n);
//      }
// }
  