package TreeInJava;

import java.lang.module.FindException;

public class SubTreeInTree {
   static class Node{
        int data; 
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

   static class BuilTree{
        static int idx =-1;
        public static Node buildNode(int nodes[]){
                idx++;
                if(nodes[idx]==-1) return null;
                Node newNode = new Node(nodes[idx]);
                newNode.left =buildNode(nodes);
                newNode.right =buildNode(nodes);
                return newNode;

        }
    }
    public static  boolean isIdentical(Node root,Node subroot){
        if(root==null && subroot==null) return true;
        if(root==null || subroot==null) return false;

        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }else{
            return false;
        }
    }
    public static  boolean Find(Node root, Node subroot){
        if(root == null) return false;
        if(subroot==null) return true;

        if(root.data == subroot.data){
               if(isIdentical(root,subroot)) return true;

        }
        return Find(root.left, subroot) || Find(root.right, subroot);
    }
    public static void main(String[] args) {
        
        int nodes[] = { 2, 4, 5, -1, -1, 5, -1, -1, 3, -1,8,-1, -1 };
        int subNodes[] = {4,5,-1,-1,5,-1,-1};

        BuilTree tree = new BuilTree();
        Node subRoot = tree.buildNode(subNodes);
        Node root = tree.buildNode(nodes);

        
        System.out.println(Find(root,subRoot));
    }
}
