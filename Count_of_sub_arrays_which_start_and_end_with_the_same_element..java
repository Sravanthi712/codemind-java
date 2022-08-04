

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,j,c,rep,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
             arr[i]=sc.nextInt();
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
                if(i!=j&& arr[i]==arr[j])
                {
                    c=c+1;
                }
            }
            if(rep==0)
            {
                s=s+(c);
            }
        }
        System.out.printf("%d",s+n);
    }
}

