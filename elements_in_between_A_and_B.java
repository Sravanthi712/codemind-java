

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int m=1;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=x && arr[i]<=y)
            {
                System.out.printf("%d ",arr[i]);
                m=0;
            }
        }
        if(m!=0)
        {
            System.out.printf("-1");
        }
        
    }
}

