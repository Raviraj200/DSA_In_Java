package TreeInJava;

import StackByLinklist.puchBottom;

public class HeightOfTree {
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

  static  class BinaryTree{
        static int idx =-1;
        public static Node buildNode(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNOde = new Node(nodes[idx]);
            newNOde.left=buildNode(nodes);
            newNOde.right=buildNode(nodes);

            return newNOde;
        }
    }
    public static int treeHeigth(Node root){
           if(root==null) return 0;
           int LeftHeigth = treeHeigth(root.left);
           int RightHeigth = treeHeigth(root.right);

           int max = Math.max(LeftHeigth, RightHeigth) +1;
           return max;
    }
    public static void main(String[] args) {   
        int nodes[] = { 4,5,6,9,11,4,-1,-1,-1,-1,-1,-1,7,10,-1,-1,-1,3,8,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildNode(nodes);
        System.out.println(treeHeigth(root));

    }
}
