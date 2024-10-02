package TreeInJava;

import StackByLinklist.puchBottom;

public class SumOfNode {
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

        public static Node buildNode(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);
            return newNode;

        }
    }

    public static int SumCount(Node root) {
        if (root == null)
            return 0;

        int LeftSum = SumCount(root.left);
        int RightSum = SumCount(root.right);

        return LeftSum + RightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 2, 4, 5, -1, -1, 5, -1, -1, 3, -1, 8, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildNode(nodes);
        System.out.println(SumCount(root));

    }
}
