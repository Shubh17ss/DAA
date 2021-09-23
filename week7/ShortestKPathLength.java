
import java.util.*;


public class week_7_3 {
    static class Edge{
        int src,nbr,wt;
        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    static class pair implements Comparable<pair>
    {
        int vt,avt,wsf;
        pair(int vt,int avt,int wsf)
        {
            this.vt=vt;
            this.wsf=wsf;
            this.avt=avt;
        }
        public int compareTo(pair o)
        {return (this.wsf-o.wsf);}
    }
    
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices=Sc.nextInt();
        ArrayList<Edge> []graph=new ArrayList[vertices];
        for(int i=0;i<vertices;i++)
        graph[i]=new ArrayList<>();
        System.out.println("Enter the number of edges");
        int edges=Sc.nextInt();
        for(int i=0;i<edges;i++)
        {
            int v1=Sc.nextInt();
            int v2=Sc.nextInt();
            int wt=Sc.nextInt();
            graph[v1].add(new Edge(v1, v2, wt));
        }
        System.out.println("Enter the value of k");
        int k=Sc.nextInt();
        System.out.println("Enter the source and the destination");
        int src=Sc.nextInt();
        int dest=Sc.nextInt();
        boolean [] visited=new boolean[vertices];
        int wsf=0;
        int count=0;
        int flag=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int arr[]=new int[vertices];
        for(int i=0;i<vertices;i++)
        arr[i]=0;
        pq.add(new pair(src,-1, wsf));
        while(pq.size()>0)
        {
            pair rem=pq.remove();
            if(rem.vt!=src)
            {
              arr[rem.vt]=arr[rem.avt]+1;
              count=arr[rem.vt];
            }
           if(rem.vt==dest&&count==k)
            {
                System.out.println("PATH EXISTS AND THE WEIGHT IS "+rem.wsf);
                flag=1;
                break;
            }
            else if(rem.vt==dest&&count!=k)
            {   
                visited[rem.vt]=false;
                count=count-1;
                continue;
            }
            if(visited[rem.vt]==true)
            continue;
            else{
                visited[rem.vt]=true;
                for(Edge e:graph[rem.vt])
                {
                    if(visited[e.nbr]==true)
                    continue;
                    else
                    {
                      pq.add(new pair(e.nbr, rem.vt,rem.wsf+e.wt));
                    }
                }
             }
        }
        if(flag==0)
        {
            System.out.println("PATH NOT FOUND SORRY...!");
        }

    }
}
