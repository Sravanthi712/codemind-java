

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q,r,s=0;
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=(s*10)+r;
            q=q/10;
        }
        int m=s,i=1,k;
        s=0;
        while(m!=0)
        {
            k=m%10;
            if(k==6 && i==1)
            {
                k=9;
                i=0;
            }
            s=(s*10)+k;
            m=m/10;
        }
        System.out.printf("%d",s);
    }
}

