import java.util.ArrayList;

public class graph {
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

    // Function to print the graph
    public static void printGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", wt=" + e.wt + ") ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int V = 5;

        // Creating adjacency list
        @SuppressWarnings("unchecked")

        // int arr[] = new arr[v];
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize each ArrayList
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

         /*
              Graph Representation

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


        //Adding edges

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, 4));
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 4));
        graph[3].add(new Edge(3, 4, 2));

        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 3, 2));

        // Print graph
        printGraph(graph);

        //2's Neighbors
        System.out.println("Neighbors of vertex 2 is: ");
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
