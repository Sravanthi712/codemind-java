

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q,r,c=0,s=1;
        q=n;
        while(q!=0)
        {
            r=q%10;
            c=c+r;
            s=s*r;
            q=q/10;
        }
        if(c==s)
        {
            System.out.printf("Spy Number");
        }
        else
        {
            System.out.printf("Not Spy Number");
        }
    }
}

