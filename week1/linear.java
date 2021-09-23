
import java.util.*;
class linear
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        int n;
        n=Sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            int size;
            size=Sc.nextInt();
            int arr[]=new int[size];
            int j;
            for(j=0;j<size;j++)
            arr[j]=Sc.nextInt();
            
            System.out.println("Enter the element to search");
            int k=Sc.nextInt();
            int flag=0;
            int count=0;
            for(j=0;j<size;j++)
            {
                count++;
                if(k==arr[j])
                {
                    flag=1;
                    break;
                }
                else 
                continue;
            }
            if(flag==1)
            {
                System.out.println("present");
                System.out.println(count);
            }
            else if(flag==0)
            {
                System.out.println("Absent");
                System.out.println(count);
            }
            
        }
    }
    
}
