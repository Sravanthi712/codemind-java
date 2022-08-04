

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
        int k,s=0;
        k=sc.nextInt();
        for(i=0;i<k;i++)
        {
            s=s+arr[i];
        }
        System.out.printf("%d",s);
    }
}