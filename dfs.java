//DFS in java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
        Assuming this adjacency list graph structure and that a node with no outgoing edges will not 
        be included in the graph
        graph = {'A': ['B', 'C'],
                'B': ['D', 'E'],
                'C': ['F'],
                'E': ['F']}
    */
    public static ArrayList<String> dfs(HashMap<String, ArrayList<String>> graph, String start) {
        ArrayList<String> visited = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(start);
        
        while(!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                if (graph.containsKey(vertex)) {
                    ArrayList<String> neighbors = graph.get(vertex);
                    ArrayList<String> unvisited = new ArrayList<String>();
                    for (String n : neighbors) {
                        if (!visited.contains(n)) {
                            unvisited.add(n);
                        }
                    }
                    for (String s : unvisited)
                        stack.push(s);
                    visited.add(vertex);
                } else {
                    visited.add(vertex); 
                }
            }
        }
        
        return visited;
    }
   /* private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Integer numNodes = new Integer(scanner.nextLine().trim());
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < numNodes; i++) {
            String[] splitNodes = scanner.nextLine().trim().split("\\s+");
            
            ArrayList<String> adjNodes = new ArrayList<String>();
            for (int j = 1; j < splitNodes.length; j++) {
                adjNodes.add(splitNodes[j]);
            }
            
            graph.put(splitNodes[0], adjNodes);
        }
        
        String start = scanner.nextLine().trim();
        ArrayList<String> dfs = dfs(graph, start);
        
        System.out.print("[");
        for (int i = 0; i < dfs.size() - 1; i++) {
            System.out.print(dfs.get(i) + ", ");
        }
        System.out.print(dfs.get(dfs.size() - 1) + "]");
    }
    */
}
