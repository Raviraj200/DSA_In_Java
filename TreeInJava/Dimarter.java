package TreeInJava;

/**
 * Dimarter
 */
public class Dimarter {
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
  
  public static int HeightOfTree(Node root) {
    if (root == null)
      return 0;

    int leftNode = HeightOfTree(root.left);
    int rightNode = HeightOfTree(root.right);
    


  return Math.max(leftNode, rightNode)+1;
  }
public static int DimartetTree(Node root){
  if(root==null)  return 0;

  int dima1 = DimartetTree(root.left);
  int dima2 = DimartetTree(root.right);
  int dima3 = HeightOfTree(root.left) + HeightOfTree(root.right) +1;
 return Math.max(dima2, Math.max(dima1, dima3));
}
  public static void main(String[] args) {
    int nodes[] = { 2, 4, 5, -1, -1, 5, -1, -1, 3, -1, 8, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildNode(nodes);
    // System.out.println(HeightOfTree(root));
    System.out.println(DimartetTree(root));

  }
}