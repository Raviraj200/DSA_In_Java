import java.util.*;

/**
 * CharacterCount
 */
public class CharacterCount {

    public static void main(String stg[]){
        String str="raviraj singh";
        int count[]= new int[256];
        for(int c=0;c<str.length();c++ ){
             count[str.charAt(c)]++;

        }
        for(int i=0; i<256;i++){
           if(count[i]>0){
            System.out.println((char)i + ": "+ count[i]);
           }
        }
        System.out.println((char)count[97]);


    }
}