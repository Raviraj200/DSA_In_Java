import java.util.*;

/**
 * AddFirst
 */
public class AddFirst {
  class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
  }
  public void addFirst(String data){
    Node newNode= new Node(data);
    if(head == null){
        head=newNode;;
        return;
    }
    newNode.next=head;

    head=newNode;
  }   
  public static void main(String age[]){
    AddFirst a=new AddFirst();
    a.addFirst("a");

  }
}



