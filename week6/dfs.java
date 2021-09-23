
import java.util.ArrayList;
import java.util.Scanner;

public class graphs1
{
    static class Edge
    {
        int src;
        int nbr;
        
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
           
        }
    }
    public static boolean haspath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited)
    {
        if(src==dest)
        return true;
        visited[src]=true;
        for(Edge edge:graph[src])
        {
            if(visited[edge.nbr]==false)
            {

            boolean hasNbrpath=haspath(graph, edge.nbr, dest,visited);
            if(hasNbrpath==true)
            return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=Sc.nextInt();
        ArrayList<Edge> []graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++)
        graph[i]=new ArrayList<>();
        int Edges=Sc.nextInt();
        System.out.println("Enter the connections");
        for(int i=0;i<Edges;i++) 
        {
            int v1=Sc.nextInt();
            int v2=Sc.nextInt();
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2,v1));
        }
        boolean visited[]=new boolean[vertices];
        System.out.println("Enter source and destination");
        int src=Sc.nextInt();
        int dest=Sc.nextInt();
        boolean path=haspath(graph, src, dest,visited);
        System.out.println("The path existence is "+path);
    }
}
