package BST;

import Framework.generies.QueueInterface.stackJava;
import StackByLinklist.puchBottom;

public class SearchTree {
   static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
        }
    }
    public static Node inSert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = inSert(root.left, val);
        }
        else{
            root.right = inSert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        inOrder(root.right);

    }
    public static boolean SearchNode(Node root, int k){
        if(root == null) return false;
        if(root.data == k) return true;
        else if (root.data>k) {
             return SearchNode(root.left, k);
        } else {
            return SearchNode(root.right, k);
        }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        int k=3;
        for(int i=0; i<values.length; i++){
            root = inSert(root, values[i]);
        }

        if(SearchNode(root, 4)){
            System.out.println("Fount");
        }else{
            System.out.println("Not Found");
        }
      
    
    }
}
