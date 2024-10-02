// package TrieDataStruction;

// /**
//  * trie
//  */
// public class trie {
//    static class Node{
//         Node[] chriNodes;
//         boolean endOfStr;
//         public Node(){
//             chriNodes =new Node[25];
//             for(int i=0; i<chriNodes.length; i++){
//                 chriNodes[i] = null;
//             }
//              endOfStr =false;
//         }
//     }
//    static Node root = new Node();

//    public static void inSert(String word){
//     Node curr = root;
//     int len = word.length();
//     for(int i=0; i<len; i++){
//         int idx = word.charAt(i)-'a';
//         if(curr.chriNodes[idx]==null){
//             curr.chriNodes[idx]=new Node();
//         }
//         if(i==word.length()-1){
//             curr.chriNodes[idx].endOfStr=true;
//         }
//         curr = curr.chriNodes[idx];
//     }
//     System.out.println(word);
//    }

//    public static boolean search(String key){
//        int len=key.length();
//        Node curr= root; 
//        for(int i=0; i<len; i++){
//            int idx = key.charAt(i)-'a';
//   Node node = curr.chriNodes[idx];
//          if(node== null ){
//             return false;
//          }
//          if(i==key.length()-1 && node.endOfStr==false){
//             return false;
//          }
//          curr = curr.chriNodes[idx];
//         }
//         return true;
//    }


    
//     public static void main(String[] args) {
//         String words[] ={"the", "a","there", "their","any"};
//         for(int i=0; i<words.length; i++){
//             inSert(words[i]);
//         }
//         System.out.println(search("the"));
//         System.out.println(search("a"));
//         System.out.println(search("ghro"));

//     }
// }


package TrieDataStruction;

/**
 * trie
 */
public class trie {
    static class Node{
        Node[] chriNode;
        boolean endOfStr;
        public Node(){
            chriNode= new Node[25];
            for(int i=0; i<25; i++){
                chriNode[i] =null;
            }
            endOfStr = false;
        }
     } 
    static Node root = new Node();
     public static void inSert(String word){
        int len = word.length();
        Node curr = root;
        for(int i=0; i<len; i++){
           int idx= word.charAt(i)-'a';
           if(curr.chriNode[idx]==null){
              curr.chriNode[idx]= new Node();
           }
           if(i==len-1){
            curr.chriNode[idx].endOfStr=true;
           }

           curr = curr.chriNode[idx];
        }
        System.out.println(word);
     }
    //  public static void inSert(String word){
        //     Node curr = root;
        //     int len = word.length();
        //     for(int i=0; i<len; i++){
        //         int idx = word.charAt(i)-'a';
        //         if(curr.chriNodes[idx]==null){
        //             curr.chriNodes[idx]=new Node();
        //         }
        //         if(i==word.length()-1){
        //             curr.chriNodes[idx].endOfStr=true;
        //         }
        //         curr = curr.chriNodes[idx];
        //     }
        //     System.out.println(word);
        //    }
     public static boolean search(String key){
        Node curr = root;
        int len = key.length();
        for(int i=0; i<len; i++){
            int idx = key.charAt(i)-'a';
            Node node = curr.chriNode[idx];
            if(node==null) return false;
            if(i==len-1 && node.endOfStr==false){
                return false;
            }
            curr =curr.chriNode[idx];

        }
        return true;
     } 
    //  public static boolean search(String key){
        //        int len=key.length();
        //        Node curr= root; 
        //        for(int i=0; i<len; i++){
        //            int idx = key.charAt(i)-'a';
        //   Node node = curr.chriNodes[idx];
        //          if(node== null ){
        //             return false;
        //          }
        //          if(i==key.length()-1 && node.endOfStr==false){
        //             return false;
        //          }
        //          curr = curr.chriNodes[idx];
        //         }
        //         return true;
        //    }
    public static void main(String[] args) {
         String word[]={"ravi","raj","singh","thakur"};
          for(int i=0; i<word.length; i++){
            inSert(word[i]);
          }
        
            System.out.println(search("ravi"));
            
System.out.println(search("sing"));
          
    }
}