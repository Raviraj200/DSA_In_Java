package Framework.generies;

/**
 * Generies
 */
public class GeneriesClass {

    public static void main(String[] args) {
        Men<String> m1 = new Men<>("ravi");
        System.out.println(m1.name);
    }
}

class Men<N>{
    N name;

    public Men(N name){
            this.name= name;
    }
}