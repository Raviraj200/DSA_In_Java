package graph;
import java.util.ArrayList;
import java.util.Stack;

public class TopSort {
    static class Edge{
        int des;
        int sor;
        public Edge(int s,int d){
            this.des=d;
            this.sor=s;
        }
    }

    public static void CreateDFS(ArrayList<Edge> graph[]){
           for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
           }
     
           graph[0].add(new Edge(0, 1));
           graph[0].add(new Edge(0, 2));
   
           graph[1].add(new Edge(1, 0));
           graph[1].add(new Edge(1, 3));
   
           graph[2].add(new Edge(2, 0));
           graph[2].add(new Edge(2, 4));
   
           graph[3].add(new Edge(3, 1));
           graph[3].add(new Edge(3, 4));
           graph[3].add(new Edge(3, 5));
   
           graph[4].add(new Edge(4, 2));
           graph[4].add(new Edge(4, 3));
           graph[4].add(new Edge(4, 5));
   
           graph[5].add(new Edge(5, 3));
           graph[5].add(new Edge(5, 4));
           graph[5].add(new Edge(5, 6));
   
           graph[6].add(new Edge(6, 5));
    }
    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis [],Stack<Integer> stack ){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size() ;i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.des]){
                topSortUtil(graph, e.des, vis, stack);
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean vis[] = new boolean[V];
        Stack<Integer>stack = new Stack<>();

        for(int i=0; i<V; i++){
            if(!vis[i]){
               topSortUtil(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()+"");
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        CreateDFS(graph);
  topSort(graph, 7);
    }
}
