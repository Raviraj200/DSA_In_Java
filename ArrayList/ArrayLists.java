import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        // Add element in ArrayList***************************
        // for (int i = 0; i <= 1; i++) {
        //     System.out.println("Enter the element" + i);

        //     list.add(s.nextInt());
        // }
        // System.out.println(list);




        // get element in ArrayList***********************************

        // System.out.println(list.get(0));



        // add element in between******************************************
        // list.add(1, 5);
        


        // set element in ArrayList********************************
        // list.set(0, 10);
        


        // delete element in ArrayList***********************************
        
        // list.remove(0);
        


        // size of ArrayList***********************************
        // int size= list.size();
        // System.out.println(size);



        ArrayList<Integer> list2= new ArrayList<>();
        for(int j=0; j<4; j++){
             System.out.println("enter a element"+ j);
            list2.add(s.nextInt());
        }
        
        Collections.sort(list2);
        System.out.println(list2);
          
    }
}
