package Framework.generies;

public class GeneriesMethods {
    public static void main(String[] args) {
         printData("Raviraj singh");
    }

    static <E> void printData( E data){
        System.out.println(data);
    }
}
