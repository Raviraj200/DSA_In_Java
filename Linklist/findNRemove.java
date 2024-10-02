import java.util.*;

/**
 * findNRemove
 */
public class findNRemove {
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
    public void printList(int indax){
        Node currNode = head;
        int i=0;

        while (i<indax) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
             i++;
            }
            currNode=currNode.next;
            while (currNode!=null) {
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
                
            }

        System.out.println("Null");
        
       
    }
    public static void main(String[] args) {
        findNRemove list = new findNRemove();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30); 
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30); 
        list.printList(3);
    }
}