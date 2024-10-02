package graph;

import java.util.*;
public class DFSData {

    static class Edge{
        int des;
        int sor;
        public Edge(int d,int s){
            this.des=d;
            this.sor=s;
        }

    }
    public static void CreateGrapg(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static void BFS(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vi[]= new boolean[V];

        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vi[curr]==false){
                 System.out.print(curr+"->");
                 vi[curr]= true;
                 for(int i=0; i<graph[curr].size();i++){
                         Edge e= graph[curr].get(i);
                         q.add(e.sor);
                 }
            }
        }
    }
    public static void CreateDFS(ArrayList<Edge> graph[], int curr, boolean vi[]){
        System.out.print(curr+" ");
        vi[curr]=true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vi[e.sor]==false){
                CreateDFS(graph, e.sor, vi);

            }
        }
            
    }

    public static void main(String[] args) {

        int V= 5;
        ArrayList<Edge> grapg[] = new ArrayList[V];
        boolean vi[]= new boolean[V];
        CreateGrapg(grapg);
        for(int i=0; i<grapg[2].size(); i++){
            Edge e = grapg[2].get(i);
            System.out.println(e.sor);

        }
        BFS(grapg, V);
        System.out.println();
        CreateDFS(grapg, 0, vi);
    }
}
