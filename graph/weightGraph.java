package graph;

import java.util.ArrayList;

/**
 * weightGraph
 */
public class weightGraph {
    static class Edge {
         int des;
         int sor;
         int wig;
         public Edge(int d,int s, int w){
            this.des=d;
            this.sor=s;
            this.wig=w;
         }  
    }

    public static void CreateGrapg(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));
        graph[2].add(new Edge(2, 0,2));

        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[]= new ArrayList[4];
        CreateGrapg(graph);
        int count =0;
        for(int i=0; i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.des+"->"+e.wig);
            count+=e.wig;
        }
      
        System.out.println(count);
    }
}