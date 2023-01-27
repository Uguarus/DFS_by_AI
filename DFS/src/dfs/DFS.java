/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;
import java.io.*;
import java.util.*;

/**
 *
 * @author icauguarus
 */
class DFS {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
  
    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
  
        for (int i : graph[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
  
    public static void main(String[] args) {
        int numNodes = 5;
        graph = new ArrayList[numNodes];
        visited = new boolean[numNodes];
  
        for (int i = 0; i < numNodes; i++) {
            graph[i] = new ArrayList<Integer>();
        }
  
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(2);
        graph[2].add(0);
        graph[2].add(3);
        graph[3].add(3);
  
        dfs(2);
    }
}

