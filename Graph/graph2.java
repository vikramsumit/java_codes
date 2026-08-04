// Depth First Search (BFS) in a graph

import java.util.*;

public class graph2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 2));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, 3));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 3));
        graph[3].add(new Edge(3, 4, 2));
        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 3, 2));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //visit
        System.out.println(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
            
        }
    }

    public static void main(String[] args) {

        /*
                    5
               0 -------- 1
               |          |
             2 |          | 1
               |          |
               2 -------- 3
                \        /
              3  \      / 2
                  \    /
                    4
        */

        int V = 5;

        // Creating adjacency list
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        // bfs(graph);

        dfs(graph, 0, new boolean[V]);
        
    }
}