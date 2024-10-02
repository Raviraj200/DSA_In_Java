package QueueDataStructure;

import Framework.generies.QueueInterface.stackJava;
import StackByLinklist.puchBottom;

public class CircularQueue {
    static class CircularQueueArray{
         static int arr[];
         static int fornt =-1;
         static int rear =-1;
         static int size;
         CircularQueueArray(int data){
            arr = new int[data];
            this.size =data;
         }

         public static boolean isEmpty(){
            return fornt==-1 && rear ==-1;
         }
         public static boolean isFull(){
            return (rear+1) % size ==fornt;
         }
         public static void add(int data){
                if(isFull()){
                    System.out.println("Queue is Full");
                    return;
                }
                if(fornt==-1){
                    fornt=0;
                }

                rear = (rear+1)%size;
                arr[rear]=data;
         }
         public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[fornt];
            if(rear==fornt){
                rear = -1;
                fornt =-1;

            }else{
                 fornt = (fornt + 1) % size;

            }
            return result;

         }
         public static int peek(){
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }
            return arr[fornt];
         }
        
    }
    public static void main(String[] args) {
        CircularQueueArray q = new CircularQueueArray(5);
        q.add(5);
        q.add(50);
        q.add(30);
        q.add(20);
        q.add(10);
        q.remove();
        q.add(565);
        while (!q.isEmpty()) {
             System.out.print(q.peek()+"->");
             q.remove();
        }
    }
}
