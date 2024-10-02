package Framework.generies.map_Interface;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
         Map<String,Integer> maps= new HashMap<>();
         Map<String,Integer> mapss = new HashMap<>();
         maps.put("a",50);
         maps.put("a", 550);
         maps.put("b",60);
         
        //  Set<String> key = maps.keySet();
        //  System.out.println(key);

        // ArrayList <String> str = new ArrayList<>((maps.keySet()));
        // System.out.println(
        //     str
        // );
         maps.replace("b",60, 160);

         mapss.putAll(maps);
        //  System.out.println(mapss);
        System.out.println(maps.keySet());

        System.out.println(maps.values());
        System.out.println(maps.entrySet());
         
    }
}
