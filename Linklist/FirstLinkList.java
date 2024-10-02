import java.util.*;

import Framework.generies.SetInterface.heshSet;
/**
 * FirstLinkList
 */
public class FirstLinkList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
   
    public void addList(int data){
        Node newNode =new Node(data);
        Node currNode= head;
        while (currNode.next!=null) {
             currNode=currNode.next;
             
        
        }
        currNode.next=newNode;
    }
    public void removeFirst(){
        if(head==null) System.out.println("list is emtpy");

        head=head.next;
    }
    public void removeList(){
        if(head==null) System.out.println("list is emtpy");
         Node currNode =head;
         int d=50;
         while (currNode.next!= null) {
            if(currNode.data==d){
                  System.out.println(currNode.data);
            }
            currNode=currNode.next;
            
         }
         currNode.next=null;
    }
    public void printList(){
        Node currNode =head;
        while (currNode!=null) {
        
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
           
        }
        System.out.println("NULL");
    }
  
    public static void main(String[] args) {
        FirstLinkList list = new FirstLinkList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addList(50);
        // list.removeFirst();
        // list.removeList();
        list.printList();
    }
}