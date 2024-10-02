public class findLevel {
    public static int level(int x,int n){
   
        if (n==0) {
        
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return level(x, n/2)*level(x, n/2);
          

        }else{
            return level(x, n/2)*level(x, n/2)*x;


        }

    }
    public static void main(String arg[]){
        int ans = level(2,5);
        System.out.println(ans);
    }
}
