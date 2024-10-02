package StackByLinklist;

/**
 * CreateStack
 */
public class CreateStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
       public static Node head;
             public static boolean isEmpty(){
                return head==null;
             }
             public static void puch(int data){
                Node newNode =new Node(data);
                if(isEmpty()){
                    head=newNode;
                    return;
                }
                newNode.next=head;
                head=newNode;

             }   
             public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top =head.data;
                head=head.next;
                return top;

             }
             public static int peek(){
                if(isEmpty()) return -1;
                
                
                
                return head.data;
             } 
    }

    public static void main(String[] args) {
        CreateStack list= new CreateStack();
        Stack s =new Stack();
        s.puch(20);
        s.puch(30);
        s.puch(50);
        System.out.println(s.peek());
    }
}