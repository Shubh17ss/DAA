
import java.util.*;
public class bellmanford {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt)
        {
            this.src=src;
            this.wt=wt;
            this.dest=dest;
        }
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=Sc.nextInt();
        ArrayList<Edge> []graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++)
        {
            graph[i]=new ArrayList<>();
        }
        System.out.println("Enter the number of edges");
        int edges=Sc.nextInt();
        for(int i=0;i<edges;i++)
        {
            int v1=Sc.nextInt();
            int v2=Sc.nextInt();
            int wt=Sc.nextInt();
            graph[v1].add(new Edge(v1, v2, wt));
        
        }
        int arr[]=new int[vertices];
        arr[0]=0;
        for(int i=1;i<vertices;i++)
        arr[i]=Integer.MAX_VALUE;

        for(int i=1;i<=vertices-1;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                for(Edge e:graph[j])
                {
                    if(arr[j]+e.wt<=arr[e.dest])
                    {
                        arr[e.dest]=arr[j]+e.wt;
                    }
                }
            }            
        }
        for(int i=0;i<vertices;i++)
        {
            System.out.println(i+" "+arr[i]);
        }
    }
}
