
import java.util.*;
class Merge_Sort
{
    static void Merge(int []arr,int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++)
        a[i]=arr[l+i];
        for(int i=0;i<n2;i++)
        b[i]=arr[mid+1+i];
        int i=0;
        int j=0;
        int k=l;
        while(i<n1&&j<n2)
        {
            if(a[i]<b[j])
            {
                arr[k]=a[i];
                k++;
                i++;
            }
            else 
            {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            arr[k]=a[i];
                k++;
                i++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            k++;
            j++;
        }
        
    }
    static void MergeSort(int []arr,int l,int h)
    {
        if(l<h){
                int mid=l+(h-l)/2;
                MergeSort(arr,l,mid);
                MergeSort(arr,mid+1,h);
                Merge(arr,l,mid,h);
               }
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
        int l=0;
        int h=n-1;
        MergeSort(arr,l,h);
        int i;
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
