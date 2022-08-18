

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int a,b,k,c=0,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        k=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.printf("%d",c);
    }
}
