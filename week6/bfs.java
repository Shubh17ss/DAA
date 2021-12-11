
import java.util.*;
public class bfs2{

    static class Edge{
        int src,nbr;
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
        }
    }
    static class pair{
        int src;
        String psf;
        pair(int src,String psf)
        {
            this.src=src;
            this.psf=psf;
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
        System.out.println("Enter the number of Edges");
        int edges=Sc.nextInt();
        System.out.println("Enter the connections in the graph");
        for(int i=0;i<edges;i++)
        {
            int v1=Sc.nextInt();
            int v2=Sc.nextInt();
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        System.out.println("Enter the source and destination");
        int src=Sc.nextInt();
        int dest=Sc.nextInt();
        boolean []visited=new boolean[vertices];
        ArrayDeque<pair> Ad=new ArrayDeque<>();
        String psf="";
        Ad.add(new pair(src, psf+src));
        while(Ad.size()>0)
        {
            pair rem=Ad.removeFirst();
            if(visited[rem.src]==true)
            continue;
            
            visited[rem.src]=true;
            if(rem.src==dest)
            {
                System.out.println("Path Found :"+rem.psf);
                break;
            }
            
            for(Edge e:graph[rem.src])
            {
                if(visited[e.nbr]==false)
                {
                    Ad.add(new pair(e.nbr, rem.psf+e.nbr));
                }
            }
        }
     }
}
