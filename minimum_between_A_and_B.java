

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
        int max=-1;
        for(i=0;i<n;i++)
             if(arr[i]>=x && arr[i]<=y)
                  if(arr[i]>max)
                       max=arr[i];
        int min=max;
        for(i=0;i<n;i++)
             if(arr[i]>=x && arr[i]<=y)
                  if(arr[i]<min)
                       min=arr[i];
        System.out.printf("%d",min);
    }
}