package graph;

import java.util.ArrayList;

/**
 * InCycle
 */
public class InCycle {
    static class Edge{
        int des;
        int sor;
        public Edge(int s, int d){
            this.des=d;
            this.sor=s;
        }
    }
    public static void CreateDFS(ArrayList<Edge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 2));
   
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));
    }

    public static boolean IsCycleinGrapg(ArrayList<Edge>graph[],boolean en[],int curr, int per){
        en[curr]=true;
        for(int i=0;i<graph.length;i++){
            Edge e = graph[curr].get(i);
            if(en[e.des] && e.des!=per){
                return true;
            }
            else if(!en[e.des]){
                if(IsCycleinGrapg(graph, en, e.des, curr)){
                    return true;
                }
             }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>graph[] =new ArrayList[5];
        CreateDFS(graph);
        System.out.println(        IsCycleinGrapg(graph, new boolean[5], 0, -1)
        );
    }
}