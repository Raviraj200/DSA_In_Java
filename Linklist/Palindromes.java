// import java.util.*;

// /**
//  * palindromes
//  */
// public class Palindromes {
//     Node head;
//     class Node {
//         int data;
//         int next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         };
//     }

//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head ==null){
//             head=newNode;
//             return;
//         }
//         new
//     }

//     public static void main(String[] args) {
//      Palindromes list = new Palindromes();
     
//     }
// }

// import java.util.*;

// /**
//  * Palindromes
//  */
// public class Palindromes {
//     Node head;
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public void CenEle(){
//         Node currNode= head;
//         Node nextNode=head;

//         while (nextNode.next.next!=null && nextNode.next!=null) {
//              currNode=currNode.next;

//              nextNode=nextNode.next.next;
//             }
//             System.out.println("Center Element is ->"+ currNode.data);
//     }
//    public void addEle(int data){
//      Node newNode = new Node(data);
//      if(head==null){
//         head=newNode;
//         return;
//      }
//      newNode.next=head;
//      head=newNode;
//    }
//    public void print(){
//     Node currNode = head;
//     while (currNode!=null) {
//          System.out.print(currNode.data+"->");
//          currNode=currNode.next;
//     }
//     System.out.println("NUll");
//    }
//     public static void main(String[] args) {
//         Palindromes list = new Palindromes();
//         list.addEle(10);
//         list.addEle(20);
//         list.addEle(30);
//         list.addEle(40);
//         list.addEle(50);
//         list.addEle(60);
//         list.addEle(400);
//         list.addEle(500);
//         list.print();
//         list.CenEle();
//     }
// }