import java.util.*;
class jump
{
    static boolean jump(int [] arr,int val,int ele)
    {
        int i=0;
        int flag=0;
        int k=i+val;
        while(i<arr.length)
        {
            if(ele<=arr[k]&&ele>=arr[i])
            {
                flag=1;
                break;
            }
            else {
            if(i>(arr.length-1-val))
            {   
                k=i;
                continue;
            }   
            else{
                i=i+val;
                k=i+val;
                continue;
            }
            
               }
        }
        if(flag==1)
        {   
            for(int j=i;j<=k;j++)
            {
                if(arr[j]==ele)
                return true;
                else 
                continue;
            }
        }
        else if(flag==0)
        return false;
        
        
       return false; 
    }
    
    
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
        }
        double m;
        m=Math.floor(Math.sqrt(n-1));
        int val=(int)m;
        System.out.println("Enter the element to search");
        int ele=Sc.nextInt();
        //System.out.println(val);
        boolean ans=jump(arr,val,ele);
        if(ans==true)
        System.out.println("\n PRESENT");
        else if(ans==false)
        System.out.println("\n NOT PRESENT");
    }
}
