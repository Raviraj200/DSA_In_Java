package BST;

import java.util.Queue;

import StackByLinklist.puchBottom;

/**
 * bst
 */
public class bst {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static Node inSert(Node root, int val){
       if(root==null){
        root = new Node(val);
        return root;
       }
       if(root.data >val){
        root.left = inSert(root.left, val);

       }else{
        root.right = inSert(root.right, val);
       }

       return root;
  }
  public static void inOrder(Node root){
    if(root==null) return;

    inOrder(root.left);
    System.out.print(root.data+"->");
    inOrder(root.right);
  }
  public static void main(String[] args) {
    int values[] ={5,1,3,4,2,7};
    
    Node root= null;
      for(int i=0; i<values.length; i++){
        root = inSert(root, values[i]);
      }
      inOrder(root);
  }
}