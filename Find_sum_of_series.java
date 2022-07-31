

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        float n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextFloat();
        float s=0;
        for(i=1;i<=n;i++)
            s=s+(float)(1/i);
        System.out.printf("%.2f",s);
    }
}
