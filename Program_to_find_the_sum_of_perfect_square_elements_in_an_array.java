

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,j,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
             arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=1;j<=arr[i];j++)
            {
                if(j*j==arr[i])
                {
                    s+=arr[i];
                }
            }
        }
        System.out.printf("%d",s);
    }
}