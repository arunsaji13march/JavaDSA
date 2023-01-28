//package EPAM;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Graph {
//    private LinkedList<Integer> adj[];
//    public Graph(int v){
//        adj=new LinkedList[v];
//        for(int i=0;i<v;i++){
//            adj[i]=new LinkedList<Integer>();
//        }
//    }
//    public void addEdge(int source,int destination){
//        adj[source].add(destination);
//        adj[destination].add(source);
//    }
//    public int bfs(int source,int destination){
//        boolean vis[]=new boolean[adj.length];
//        Queue<Integer> q=new LinkedList<Integer>();
//        int parent[]=new int[adj.length];
//
//        q.add(source);
//        parent[source]=-1;
//
//    }
//
//    public static void main(String ags[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number of vertices and edges ");
//        int v= sc.nextInt();
//        int e=sc.nextInt();
//        Graph graph=new Graph(v);
//        System.out.println("enter "+e+ " edges");
//        for(int i=0;i<e;i++){
//            int source= sc.nextInt();;
//            int destination=sc.nextInt();
//            graph.addEdge(source,destination);
//        }
//
//    }
//
//
//}
