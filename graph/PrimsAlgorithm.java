package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import TrieDataStruction.trie;

/**
 * PrimsAlgorithm
 */
public class PrimsAlgorithm {
    static class Edge {
        int sor;
        int des;
        int wig;

        public Edge(int s, int d, int w) {
            this.des = d;
            this.sor = s;
            this.wig = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(3, 1, 40));
    }

    static class Pari implements Comparable <Pari>{
           int node;
           int wrg;
         public Pari(int d,int w){
           this.node=d;
           this.wrg=w;
           }
           @Override
           public int compareTo(Pari p2){
            return this.wrg - p2.wrg;
           }
    }
    public static void  PrimsAlg(ArrayList<Edge>graph[],int V){
               PriorityQueue<Pari> pq = new PriorityQueue<>();
               boolean vis[]= new boolean[V];
               pq.add(new Pari(0, 0));
               int mstCost = 0;

               while (!pq.isEmpty()) {
                        Pari curr= pq.remove();
                        if(!vis[curr.node]){
                            vis[curr.node]=true;
                            mstCost+= curr.wrg;

                            for(int i=0; i<graph[curr.node].size(); i++){
                                                      Edge e= graph[curr.node].get(i);
                                                      if(!vis[e.des]){
                                                        pq.add(new Pari(e.des, e.wig));
                                                      }
                            }
                        }

               }
               System.out.println(mstCost);
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        CreateGraph(graph);
        PrimsAlg(graph, 5);
    }
}