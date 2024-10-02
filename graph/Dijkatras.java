package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkatras {

    static class Edge{
        int des;
        int sor;
        int wor;
        public Edge(int s , int d, int w){
            this.des=d;
            this.sor=s;
            this.wor=w;
        }
    }

    public static void CreateGraph(ArrayList<Edge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pari implements Comparable<Pari> {
      int node ;
      int dist;

      public Pari(int n, int d){
        this.dist=d;
        this.node=n;
      }
      @Override
      public int compareTo(Pari p2){
        return this.dist - p2.dist;
      }
        
    }
   
    public static void Dijkatra(ArrayList<Edge> graph[],int scr, int V){
          PriorityQueue<Pari> pq = new PriorityQueue<>();
          int dist[]= new int[V];

          for(int i=0; i<V; i++){
            if(i!=scr){
                dist[i]=Integer.MAX_VALUE;
            }
          }
          boolean vis[]= new boolean[V];

          pq.add(new Pari(0, 0));

          while (!pq.isEmpty()) {
            Pari curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e= graph[curr.node].get(i);
                    int u=e.sor;
                    int v=e.des;
                    if(dist[u]+e.wor < dist[v]){
                        dist[v]= dist[u]+e.wor;
                        pq.add(new Pari(v,dist[v]));
                    }
                }
            }
          }
 for(int i=0; i<V; i++){
    System.out.print(dist[i]+"-> ");
 }
    }
    public static void main(String[] args) {
      int V=6;
      ArrayList<Edge> graph[]= new ArrayList[V];
      CreateGraph(graph);
        
      Dijkatra(graph, 0, V);
    }
}
