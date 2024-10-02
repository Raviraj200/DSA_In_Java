package TreeInJava;

import java.nio.channels.Pipe.SourceChannel;
import java.util.LinkedList;
import java.util.Queue;

import StackByLinklist.puchBottom;

public class subTree {
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
            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);

            return newNode;
        }
    }


    public static void sumNodeTree(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);

                }
            } else {
                System.out.println(currNode.data + " ");
                if (currNode.left != null)
                    q.add(currNode.left);

                if (currNode.right != null)
                    q.add(currNode.right);

            }

        }

    }
    public static void main(String[] args) {
        int nodes[] = { 2, 4, 5, -1, -1, 5, -1, -1, 3, -1, 8, -1, -1 };
        int subNodes[] = { 4, 5, 5 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildNode(nodes);
        subNodeTree(root);

    }
}
