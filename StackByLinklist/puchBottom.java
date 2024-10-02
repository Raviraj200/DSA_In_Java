package StackByLinklist;

import java.util.LinkedList;
import java.util.Stack;

public class puchBottom {
    public static void puchAtBottom(int data, Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        puchAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        
        Stack<Integer> s= new Stack<>();
        s.push(20);
        s.push(30);
        s.push(50);
    
        puchAtBottom(55, s);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
