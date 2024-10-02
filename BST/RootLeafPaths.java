package BST;

import java.util.ArrayList;

/**
 * RootLeafPaths
 */
public class RootLeafPaths {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
        }
    }
    public static Node BuildTree(Node root, int val){
         if(root==null){
            root = new Node(val);
            return root;
         }
         if(root.data>val){
            root.left= BuildTree(root.left, val);

         }else{
            root.right=BuildTree(root.right, val);
         }
         return root;
    }
    public static void printPath(ArrayList arr){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
    public static void WayofRoot(Node root,ArrayList arr){
         if(root==null) return;
         arr.add(root.data);
            if(root.left==null && root.right==null){
                printPath(arr);
            }
            else{

                WayofRoot(root.left, arr);
                WayofRoot(root.right, arr);
            }
   
 arr.remove(arr.size()-1);
    }
    public static void inOrder(Node root){
        if(root== null) return;
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right); 
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        ArrayList<Integer> arr = new ArrayList<>();
        Node root=null;
        for(int i=0 ; i<values.length; i++){
             root = BuildTree(root, values[i]);
        }
        // inOrder(root);
       inOrder(root);
       System.out.println();
       WayofRoot(root,arr);

    

    }
}