

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int q,r,c1=0,c2=0;
        q=n;
        while(q!=0)
        {
            r=q%10;
            if(r%2!=0)
            {
                c1++;
            }
            else if(r%2==0)
            {
                c2++;
            }
            q/=10;
        }
        if(c1==0 && c2!=0)
        {
            System.out.printf("Even");
        }
        else if(c1!=0 && c2==0)
        {
            System.out.printf("Odd");
        }
        else
        {
            System.out.printf("Mixed");
        }
    }
}

