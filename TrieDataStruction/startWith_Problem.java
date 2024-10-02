package TrieDataStruction;

/**
 * startWith_Problem
 */
public class startWith_Problem {
    static class Node {
        Node word[];
        boolean endOfStr;

        public Node() {
            word = new Node[25];
            for (int i = 0; i < word.length; i++) {
                word[i] = null;
            }
            endOfStr = false;
        }
    }

    static Node root = new Node();

    public static void inSert(String work) {
        int len = work.length();
        Node curr = root;
        for (int i = 0; i < len; i++) {
            int idx = work.charAt(i) - 'a';
            if (curr.word[idx] == null) {
                curr.word[idx] = new Node();

            }
            if (i == len - 1)
                curr.endOfStr = true;
            curr = curr.word[idx];
        }

    }

    public static boolean startWith(String key) {
        int len = key.length();
        Node curr = root;
        for (int i = 0; i < len; i++) {
            int idx= key.charAt(i)-'a';
            if (curr.word[idx] == null)
                return false;
                curr=curr.word[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "ravi", "raj", "singh", "thakur" };
        for (int i = 0; i < arr.length; i++) {
            inSert(arr[i]);
        }
        System.out.println(startWith("ravi"));
    }
}