package TreeInJava;

import Framework.generies.QueueInterface.stackJava;
import StackByLinklist.puchBottom;

/**
 * CountNode
 */
public class CountNode {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node builNode(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builNode(nodes);
            newNode.right = builNode(nodes);

            return newNode;
        }
    }

    public static int CountOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int LeftCount = CountOfNode(root.left);

        int rightCount = CountOfNode(root.right);
       
        int r= LeftCount + rightCount + 1;

        return r;
    }

    public static void main(String[] args) {
        int nodes[] = { 2, 4, 5, -1, -1, 5, -1, -1, 3, -1,8,-1, -1 };
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.builNode(nodes);

System.out.println(CountOfNode(root));
    }
}