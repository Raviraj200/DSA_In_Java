package MapInterface;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

/**
 * hashmapInterface
 */
public class hashmapInterface {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", +91);
        map.put("USA", +01);
        map.put("China", +50);

        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsValue(+91));
        // int arr[]={10,20,30,40};
        // for(int val :arr){
        //     System.out.println(val);
        // }

      for(Map.Entry<String,Integer> e:map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
      }

      Set<String> keys = map.keySet();
      for(String key:keys){
        System.out.println(key+" "+map.get(key));
      }
     }
}