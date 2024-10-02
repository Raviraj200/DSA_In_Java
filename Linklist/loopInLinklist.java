public class loopInLinklist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addEle(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void checkLoop(){
        Node currNode=head;
        Node nextNode =head;

        if(currNode.next==null) System.out.println("List length only one");
        while (nextNode.next!=null||nextNode.next.next!=null) {
             nextNode=nextNode.next.next;
             currNode=currNode.next;
             if(nextNode==currNode){
                System.out.println("loop in list");
             }else{
                System.out.println("no loop in lisk");
             }
                    }
        
    
    }
    public static void main(String[] args) {
        loopInLinklist list = new loopInLinklist();
        list.addEle(10);
        list.addEle(10);

        list.checkLoop();

    }
}
