package QueueDataStructure;

import Framework.generies.QueueInterface.stackJava;

/**
 * queueByArr
 */
public class queueByArr {
   static class Queue{
      static int arr[];
      static int rear =-1;
      static int size;
      Queue(int data){
         arr = new int[data];
         this.size=data;
      }
      public static boolean isEmpty(){
         return size==-1;
      }
      public static void add(int data){
         if(rear==size-1){
            System.out.println("Queue is full");
            return;
         }
         rear++;
         arr[rear]=data;

      }
      public static int remove(){
         if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
         }
         int fornt = arr[rear];
         for(int i=0; i<rear; i++ ){
            arr[i]=arr[i+1];
         }
         rear--;
         return fornt;
      }

      public static int peek(){
         if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
         }
         return arr[0];

      }


   }

   public static void main(String[] args) {
      Queue q =new Queue(5);
      q.add(500);
      q.add(50);
      q.add(200);
      q.add(40);
      q.add(80);
      while (!q.isEmpty()) {
         System.out.print(q.peek()+"->");
         q.remove();
      }
   }
}