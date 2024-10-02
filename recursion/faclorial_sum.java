
import java.util.*;

public class faclorial_sum {
    public static void facSum(int n,int sum){
        if(n==1){
            // sum=sum*n;
            System.out.println(sum);
            return;
        }
        sum=sum*n;
        facSum(n-1, sum);

    }
    public static void main(String agre[]){
        facSum(5,1);
    }
    
}
