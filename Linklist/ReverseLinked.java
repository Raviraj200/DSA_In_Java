import java.util.*;
public class ReverseLinked {
    Node head;
    Node head1;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void AddFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void recursiveList(){
        
        if(head ==null) System.out.println("list is emtpy");
        // if(head.next==null) System.out.println("list size is only one");
        Node prevNode = head;
        Node currnode = head.next;
        while (currnode!=null) {
            Node nextNode =  currnode.next;
            currnode.next=prevNode;

            prevNode=currnode;
            currnode=nextNode;
        }     
        head.next=null;
        head=prevNode;
    }
 
    public void printList(){
        Node currNode = head; 
    
        if(head==null) System.out.println("list is empty");
        while (currNode!=null) {
            System.out.print (currNode.data + "->");
            currNode=currNode.next;
        
    
        }

        System.out.println("Null");
        

    }
    public static void main(String[] args) {
        
     ReverseLinked list = new ReverseLinked();

     list.AddFirst(10);
     list.AddFirst(20);
     list.AddFirst(30);
     list.printList();
    //  list.recursiveList();
    list.recursiveList();
    list.printList();

    }
}
