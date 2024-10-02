package Framework.generies.QueueInterface;

import java.util.ArrayDeque;

public class QueueJava1 {
    public static void main(String[] args) {
        ArrayDeque <Integer> que = new ArrayDeque<>();

        que.offer(10);
        que.offer(20);
        que.offer(30);
        
        System.out.println(que);
        que.poll();
        System.out.println(que);
   System.out.println(que.peek());
    }
}
