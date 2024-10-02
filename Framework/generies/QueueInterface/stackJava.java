package Framework.generies.QueueInterface;

import java.util.ArrayDeque;

public class stackJava {
    public static void main(String[] args) {
        ArrayDeque <Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.poll();
        System.out.println(stack);

    }
}
