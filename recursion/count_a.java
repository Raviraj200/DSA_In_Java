import java.util.*;


public class count_a {
    public static int first=-1;
public static int secount=-1;
    public static void findF(String s,int n,char a){
          if(s.length()==n){
            System.out.println(first);
            System.out.println(secount);
            return;
          }

          int curr=s.charAt(n);
          if(curr==a){
            if(first==-1){
                first=n;
            }else{
                secount=n;
            }
          }
          findF(s, n+1, a);
    }

    public static void main(String arg[]){
        String str="agfjfdfbaadbvabvb";

        findF(str,0,'a');
    }
}