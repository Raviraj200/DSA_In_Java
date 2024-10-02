// package QueueDataStructure;

// import Framework.generies.QueueInterface.stackJava;

// public class QueueByLinklist {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Queue{
//         static Node head = null;
//         static Node tail =null;
//         public static boolean isEmpty(){
//             return head==null && tail==null;
//         }
//         public static void add(int data){
//         //    if(isEmpty()){
//         //     System.out.println("Queue is Empty");
//         //     return;
//         //    }
//            Node newNode = new Node(data);
//            if(tail==null){
//             tail = head = newNode;
//             return;
//            }
//            tail.next=newNode;
//            tail=newNode;
           
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int fornt = head.data;
//             if(head==tail){
//                 tail=null;
//             }
//             head =head.next;
//             return fornt;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



package QueueDataStructure;

import StackByLinklist.puchBottom;

/**
 * QueueByLinklist
 */
public class QueueByLinklist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Queue{
        static Node head =null;
        static Node tail =null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                tail = head = newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int forny = head.data;
            if(head==tail){
                tail=null;
                return -1;
            }
            head=head.next;
            return forny;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");

                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
          Queue q = new Queue();
          q.add(20);
          q.add(40);
          q.add(60);
          q.add(80);
          while (!q.isEmpty()) {
            System.out.print(q.peek()+"->");
            q.remove();
            
          }
    }
}