

import java.util.Scanner;

class java
{
    public int ispali(int n)
    {
        int q,r,s=0;
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=(s*10)+r;
            q=q/10;
        }
        if(s==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public int isprime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        int i,c=1;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c=0;
            }
        }
        if(c==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        int n,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        java t=new java();
        for(j=n+1;j<100000;j++)
        {
            if(t.ispali(j)==1 && t.isprime(j)==1)
            {
                System.out.printf("%d",j);
                break;
            }
        }
    }
}