import java.util.*;
class selection
{
    static void selection(int []arr,int n)
    {
        int i,j;
        for(i=0;i<n-1;i++)
        {
            int ind=i;
            int smallest=arr[i];
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<smallest)
                {
                    smallest=arr[j];
                    ind=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[ind];
            arr[ind]=t;
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
        }
        selection(arr,n);
    }
}
