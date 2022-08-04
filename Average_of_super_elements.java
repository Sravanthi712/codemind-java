

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
        int c,s=0,rep,x=0;
        float avg;
        for(i=0;i<n;i++)
        {
            c=0;
            rep=0;
            for(j=0;j<n;j++)
            {
                if(j<i && arr[i]==arr[j])
                {
                    rep=1;
                }
                if(arr[i]==arr[j]&& i!=j)
                {
                    c=c+1;
                }
            }
            if(arr[i]==c+1 && rep==0)
            {
                s=s+arr[i];
                x++;
            }
        }
        if(x==0)
        {
            System.out.printf("-1");
        }
        else
        {
            avg=(float)s/x;
            System.out.printf("%.2f",avg);
        }
    }
}

