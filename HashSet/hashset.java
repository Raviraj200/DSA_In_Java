package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * hashset
 */
public class hashset {

    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        System.out.println(set);
        if(set.contains(5));
        set.remove(5);
        Iterator i = set.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}