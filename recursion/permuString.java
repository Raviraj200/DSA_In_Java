import java.util.*;

/**
 * permuString
 */
public class permuString {
    public static void permuPrint(String str, String permu){
        if(str.length()==0){
            System.out.println(permu);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currChar=str.charAt(i);
            String p=str.substring(0, i)+ str.substring(i+1);
            permuPrint(p, permu+currChar);
        }
    }

    public static void main(String arg[]){
        String str="abc";
        permuPrint(str,"");
    }
}