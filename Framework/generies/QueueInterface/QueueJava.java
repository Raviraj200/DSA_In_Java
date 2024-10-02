package Framework.generies.QueueInterface;
import java.util.*;
import java.util.LinkedList;

public class QueueJava {
   public static void main(String[] args) {
    QueueJava1<Integer> queue= new LinkedList<>();
    // queue.add(50);
    queue.offer(50);
    
    for(int q :queue){
        System.out.println(queue.poll());
    }
   }
    
}
