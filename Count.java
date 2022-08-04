

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
             arr[i]=sc.nextInt();
        int c1=0,c2=0;
        for(i=0;i<n;i++)
            if(arr[i]%2==0)
                 c1++;
            else
                 c2++;
        System.out.printf("%d ",c1);
        System.out.printf("%d",c2);
    }
}

