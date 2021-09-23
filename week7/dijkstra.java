
import java.util.*;


public class dijkstra
{
    public static class Edge{
        int src,nbr,wt;
        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    public static class pair implements Comparable<pair>{
        int vt,wsf;
        String psf;
        pair(int vt,String  psf,int wsf)
        {
            this.wsf=wsf;
            this.vt=vt;
            this.psf=psf;
        }
        public int compareTo(pair o)
        {
            return this.wsf-o.wsf;
        }
    }
      public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=Sc.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[vertices];
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
            graph[v2].add(new Edge(v2, v1, wt));
        }
        System.out.println("Enter the source and the destination");
        int src=Sc.nextInt();
        int dest=Sc.nextInt();
        boolean []visited=new boolean[vertices];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        String psf=""+src;
        int wsf=0;
        pq.add(new pair(src, psf, wsf));
        while(pq.size()>0)
        {
            pair rem=pq.remove();
            if(visited[rem.vt]==true)
            continue;
            visited[rem.vt]=true;
            if(rem.vt==dest){
            System.out.println(rem.vt+" via "+rem.psf+" @ "+rem.wsf);
            }
            for(Edge e:graph[rem.vt])
            {
                if(visited[e.nbr]==false)
                pq.add(new pair(e.nbr, rem.psf+e.nbr, rem.wsf+e.wt));
            }
        }
        


    }

}
