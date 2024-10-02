package TrieDataStruction;

import StackByLinklist.puchBottom;
import TreeInJava.subTree;

public class longestWord {
    static class Node {
        Node data[];
        boolean endOfStr;

        public Node() {
            data = new Node[25];
            for (int i = 0; i < data.length; i++) {
                data[i] = null;
            }
            endOfStr = false;
        }
    }

    static Node node = new Node();

    public static void inSert(String work) {
        int len = work.length();
        Node curr = node;
        for (int i = 0; i < len; i++) {
            int idx = work.charAt(i) - 'a';
            if (curr.data[idx] == null) {
                curr.data[idx] = new Node();
            }
            if (i == len - 1) {
                curr.endOfStr = true;
            }
            curr = curr.data[idx];
        }
        // System.out.println(work);
    }

    public static boolean search(String key) {
        int len = key.length();
        Node curr = node;
        for (int i = 0; i < len; i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.data[idx] == null) {
                return false;
            }
            if (i == len - 1 && curr.endOfStr == false) {
                return false;
            }
            curr = curr.data[idx];
        }
        return true;
    }
  
    public static String ans ="";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null) return;
        for(int i=0; i<26; i++){
            if(root.data[i] != null && root.data[i].endOfStr==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans =  temp.toString();
                }
                longestWord(root.data[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    } 
    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            inSert(words[i]);

        }
        longestWord(node, new StringBuilder(""));
        System.out.println(ans);

    }
}
