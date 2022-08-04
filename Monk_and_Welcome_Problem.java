

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int [n];
        int []b=new int [n];
        int []c=new int [n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int s=0;
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.printf("%d ",c[i]);
        }
    }
}

