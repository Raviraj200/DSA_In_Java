package AnonymousClass;

/**
 * AnonymousEx
 */
public class AnonymousEx {

    interface One{
        void print(int n);
    }

    public static void main(String ags[]){
        One obj =(int n )->{
            System.out.println("Hello"+n);
        };
        obj.print(5);
    }
}