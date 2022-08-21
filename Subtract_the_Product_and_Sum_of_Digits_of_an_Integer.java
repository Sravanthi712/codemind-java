

import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q,r,s=0,p=1;
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            p=p*r;
            q=q/10;
        }
        if(s>p)
        {
            System.out.println(s-p);
        }
        else
        {
            System.out.println(p-s);
        }
    }
}
