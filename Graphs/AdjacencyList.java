package Graphs;

import java.util.ArrayList;

public class AdjacencyList {
    static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}
    public static void main(String[] args) {
         ArrayList<Edge> graph[] = new ArrayList[4];
         graph[0] = new ArrayList<Edge>();
         graph[0].add(new Edge(0, 2));
         graph[1] = new ArrayList<Edge>();
         graph[1].add(new Edge(1, 2));
         graph[1].add(new Edge(1, 3));
         graph[2] = new ArrayList<Edge>();
         graph[2].add(new Edge(2, 0));
         graph[2].add(new Edge(2, 1));
         graph[2].add(new Edge(2, 3));
         graph[3] = new ArrayList<Edge>();
         graph[3].add(new Edge(3, 1));
         graph[3].add(new Edge(3, 2));
        
        }
}

