
import java.util.*;
class insertion_2
{
    static void insertion(int []arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int index=i;
            int val=arr[index];
            while(index>0&&arr[index-1]>val)
            {
                arr[index]=arr[index-1];
                index=index-1;
            }
            arr[index]=val;
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n;
        n=Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=Sc.nextInt();
        insertion(arr,n);
    }
}
