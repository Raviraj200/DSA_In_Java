package TrieDataStruction;

import Framework.generies.SetInterface.enumSet;

public class countOfsubString {
    static class Node{
        Node word[];
        boolean endOfStr;
        public Node(){
            word =new Node[25];
            for(int i=0; i<word.length; i++){
                word[i]=null;
            }
            endOfStr= false;
        }
    }

static Node root = new Node();
    public static void inSert(String word){
        int len=word.length();
        Node curr =root;
        for(int i=0;i<len; i++){
            int idx = word.charAt(i)-'a';
            if(curr.word[idx]==null){
                curr.word[idx] = new Node();

            }
            if(i==len-1){
              boolean  endOfStr = true;
            }
        }
    }

    public static boolean search(String key){
        int len = key.length();
        Node curr = root;
        for(int i=0; i<len; i++){
            int idx = key.charAt(i)-'a';
            if(curr.word[idx]==null) return false;
            if(i==len-1 && curr.endOfStr==false){
                return false;
            }
            curr = curr.word[idx];
        }
        return true;
    }
    public static int count(Node root){

                if(root == null) return 0;
                int c=0;
                for(int i=0; i<26; i++){
                    if(root.word[i]!=null){
                        c+=count(root.word[i]);
                    }
                }
                return c+1;

    }
    public static void main(String[] args) {
        String arr = "abbab";
        for(int i=0;i<arr.length(); i++){
                inSert(arr.substring(i));
        }
        System.out.println(count(root));
    }
}
