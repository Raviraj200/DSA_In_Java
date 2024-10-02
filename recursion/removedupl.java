import java.util.*;

/**
 * remove_dupl
 */
public class removedupl {
    public static void removedupl(String str,int idx,String newStr,int count){
        if(str.length()==idx){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
        char newStes=newStr.charAt(count);
        // System.out.println(newSte);

        if(curr==newStes){
            removedupl(str, idx+1, newStr,count);
        }else{
           newStr+=curr;
           count++;
           removedupl(str, idx+1, newStr, count);

        }
    } 

    public static void main(String agr[]){
        String str="abaclsdl";
        // int size=str.length();
        String newStr="";
        removedupl(str,1,newStr,1);
    }
}