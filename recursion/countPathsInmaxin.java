import java.util.*;
/**
 * countPathsInmaxin
 */
public class countPathsInmaxin {
    public static int countPaths(int i,int j,int n, int m){
        if(i==n ||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downCount=countPaths(i+1, j, n, m);
        int rightCount = countPaths(i, j+1, n, m);
        

        return downCount+rightCount;
    }
     public static void main(String agr[]){
        int n=4,m=4;
        int totalPaths=countPaths(0,0,n,m);
        System.out.println(totalPaths);
     }
}