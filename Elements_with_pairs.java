

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(n%2==0)
        {
            for(i=0;i<n;i++)
            {
                System.out.printf("%d ",arr[i]);
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                System.out.printf("%d ",arr[i]);
            }
            System.out.printf("0");
        }
    }
}
