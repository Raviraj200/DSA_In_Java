public class placeTiles {
      
    public static int numOfTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int v=numOfTiles(n-m, m);

        int h=numOfTiles(n-1, m);
        return h+v;
    }
      public static void main(String arg[]){
        int n=4,m=2;
        int total =numOfTiles(n,m);
        System.out.println(total);
     }
}
