package graph;

import java.util.ArrayList;

import StackByLinklist.puchBottom;

public class AllPath {
    static class Edge{
    int des;
    int sor;
    public Edge(int d, int s){
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
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean ve[]){
        System.out.print(curr+" ");
        ve[curr]=true;

        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(ve[e.sor]==false){
                DFS(graph, e.sor, ve);
            }
        }


    }
    public static void Path(ArrayList<Edge> graph[], boolean vis[],int curr, String path, int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);

            if(!vis[e.des]){
                vis[curr] = true;
                Path(graph, vis, e.des, path+e.des, tar);
                vis[curr]= false;
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList <Edge> graph[]= new ArrayList[7];
        boolean ve[] = new boolean[7];


        CreateDFS(graph);
    //   DFS(graph, 0, ve);
      Path(graph, new boolean[V], 0, "0",4 );
    }
}

