package BST;

public class DeleteNote {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node BuildTree(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = BuildTree(root.left,val);
        }
        else{
            root.right = BuildTree(root.right, val);
        }
        return root;

    }


    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }
    // Delete
    public static Node DeleteNote(Node root,int val){
        if(root == null) {
            return null;
        }
        if(root.data >val){
            root.left = DeleteNote(root.left, val);
        }
        else if(root.data <val){
               root.right = DeleteNote(root.right, val);

        }else{
            // case 1
            if(root.left ==null && root.right==null){
                       return  null;
            }

            // case 2
            if(root.left ==null){
                root =root.right;
            }else if(root.right==null){
                root=root.left;
            }
            // case 3
            
        }



    }
    public static void main(String[] args) { 
        int values[]={5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = BuildTree(root, values[i]);
        }
         inOrder(root);

    }
}
