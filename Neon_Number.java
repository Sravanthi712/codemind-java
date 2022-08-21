

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q=n*n;
        int s=0,r;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            q=q/10;
        }
        if(s==n)
        {
            System.out.printf("Neon Number");
        }
        else
        {
            System.out.printf("Not Neon Number");
        }
    }
}

