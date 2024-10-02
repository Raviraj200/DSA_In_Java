package TrieDataStruction;

import Framework.generies.SetInterface.enumSet;
import TreeInJava.levelOrder;

/**
 * workBrack
 */
public class workBrack {
    static class Node{
        Node chriNode[];
        boolean endOfStr;
        public Node(){
            chriNode = new Node[25];
            for(int i=0; i<25; i++){
                chriNode[i]=null;
            }
            endOfStr =false;
        }
    }

    static Node node= new Node();

    public static void inSert(String word){
        int len = word.length();
        Node curNode = node;
        for(int i=0; i<len; i++){
            int idx = word.charAt(i)-'a';
            if(curNode.chriNode[idx]==null){
                curNode.chriNode[idx]= new Node();
            }
            if(i==len-1){ 
                curNode.chriNode[idx].endOfStr =true;
            }
            curNode = curNode.chriNode[idx];
        }
        
    }
    // static Node root = new Node();

    public static boolean search(String key){
        int len= key.length();
        Node currNode = node;
        for(int i=0; i<len;i++){
            int idx = key.charAt(i)-'a';
            Node node = currNode.chriNode[idx];
            if(node ==null) return false;

            if(i==len-1 && node.endOfStr==false) return false;
            currNode =currNode.chriNode[idx];
        }
        return true;
    }

    public static boolean Workbrack(String works){
        int len = works.length();
        if(len==0) return true; 
        for(int i=1; i<=len ; i++){
         String FirstPart = works.substring(0, i);
         String SecondPart = works.substring(i);
         if(search(FirstPart) && Workbrack(SecondPart)){
            return true;
         }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile"};
        String ket= "ilikesamsung";
        for(int i=0; i<words.length; i++){
            inSert(words[i]);
        }
        System.out.println(Workbrack(ket));

    }
}