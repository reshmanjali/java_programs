//Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to find the number of connected components in an undirected graph.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int countComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> adj =new HashMap<Integer,List<Integer>>();
        init(adj,edges,n);
        boolean[] visited = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(adj,i,visited);
                c++;
            }
        }
        return c;
    }
    public static void dfs(HashMap<Integer,List<Integer>> adj, int i, boolean[] visited){
        visited[i] = true;
        for(Integer aa : adj.get(i)){
            if(visited[aa] == false){
                dfs(adj, aa, visited);
            }
        }
        
    }
    public static void init(HashMap<Integer,List<Integer>> adj, int[][] edges, int indx){
        for(int i=0;i<indx;i++){
            adj.put(i, new LinkedList<Integer>());
        }
        for(int j=0;j< edges.length;j++){
           adj.get(edges[j][0]).add(edges[j][1]);
           adj.get(edges[j][1]).add(edges[j][0]);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scanner.nextLine());
        int edges = Integer.parseInt(scanner.nextLine());
        
        int[][] prerequisites = new int[edges][2];
        
        for (int i = 0; i < edges; i++) {
            String[] classes = scanner.nextLine().trim().split("\\s+");
            int[] edge = {Integer.parseInt(classes[0]), Integer.parseInt(classes[1])};
            prerequisites[i] = edge;
        }
        
        System.out.println(countComponents(n, prerequisites));
    }
}
