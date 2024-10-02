// package Handing;

// public class FinallyBlock {
//     public static void main(String age[]){
//         int arr[]=new int[5];

//         // try{
//         //     System.out.println(arr[6]);
//         // }catch(Exception e){
//         //     System.out.println("Error");
//         // }finally{
//         //     System.out.println("Run Finally");
//         // }


//         try{
//             System.out.println(arr[4]);
//         }finally{
//             System.out.println("Run Finally");
//         }
//     }
// }


package Handing;

import java.util.ArrayList;
import java.util.List;

/**
 * FinallyBlock
 */
public class FinallyBlock {

    public static void main(String sge[]){
        String str="Raviraj singh thakur";
        int count[]=new int[256];
        
        
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }

        for(int i=0; i<256; i++){
            if(count[i]>0)
            System.out.println((char)i+" "+count[i]);
        }
        

    }
}