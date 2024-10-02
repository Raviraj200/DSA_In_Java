// package MapInterface;

// import java.util.HashMap;

// public class Itinerary {
//     public static void Flow(String start,HashMap<String,String> map,String last){
//         while (map.containsKey(start)) {
//             System.out.print(start+"->");
//             start=map.get(start);
//         }
//         System.out.print(last);
//     }

//     public static void RoadMap(String arr[], String arr2[]){
//         HashMap<String,String> map = new HashMap<>();  
//         HashMap<String, String > Map2 = new HashMap<>();


//         for(int i=0; i<arr.length; i++){
//             map.put(arr[i],arr2[i]);
//             Map2.put(arr2[i],arr[i]);
//         }
//         String start;
//         for(String key : map.keySet()){
//             if(!(Map2.containsKey(key))){
//                 start=key;
         
//                 Flow(start,map,"Bengaluru");
                
//             }
          
//         }
//     }
//     public static void main(String[] args) {
//         String arr[]= {"chennai","mumbai","goa","delhi"};
//         String arr2[]={"Bengaluru","delhi","chennai","goa"};

//         RoadMap(arr, arr2);
        
//     }
// }



package MapInterface;

import java.util.HashMap;

/**
 * Itinerary
 */
public class Itinerary {
    public static void Flow(String start, HashMap<String,String> map){
        System.out.print("Start->");
                  while (map.containsKey(start)) {
                         System.out.print(start+"->");
                         start=map.get(start);
                  }
                  System.out.print("Bengaluru->End");
    } 
    public static void RoadMap(String arr[],String arr2[]){
        HashMap<String,String> map= new HashMap<>();
        HashMap<String,String>SwitchMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],arr2[i]);
            SwitchMap.put(arr2[i],arr[i]);
        }
        String start;
        for(String ket:map.keySet()){
            if(!SwitchMap.containsKey(ket)){
                start=ket;
                Flow(ket,map);


            }
        }
    }

    public static void main(String arg[]){
        String arr[]= {"chennai","mumbai","goa","delhi"};
        String arr2[]={"Bengaluru","delhi","chennai","goa"};
        RoadMap(arr,arr2);
    }
}