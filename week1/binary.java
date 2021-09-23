import java.util.*;
class binary
{
    
    static boolean binarySearch(int []arr,int l,int h,int key)
    {
     
        if(l>h)
        return false;
        else 
        {
        int mid=l+(h-l)/2;
        if(arr[mid]==key)
        return true;
        else if(arr[mid]<key)
        binarySearch(arr,mid+1,h,key);
        else if(arr[mid]>key)
        binarySearch(arr,l,mid-1,key);
        }
   
    return false;
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
       System.out.println("Enter the key element");
       int key=Sc.nextInt();
       int l=0;
       int h=n-1;
      
       if( binarySearch(arr,l,h,key)==true)
       System.out.println("\nPRESENT");
       else 
       System.out.println("\nNOT PRESENT");
    }
}