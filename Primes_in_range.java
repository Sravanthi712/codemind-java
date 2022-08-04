

import java.util.Scanner;

class prime
{
    public int yes(int n)
    {
        int c=0,i;
        if(n==1)
          return 0;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        int n,m,j,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        prime t=new prime();
        for(j=n;j<=m;j++)
        {
            
            if(t.yes(j)==1)
            {
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}