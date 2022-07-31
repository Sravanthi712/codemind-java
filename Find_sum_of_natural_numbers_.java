

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,s=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            s+=i;
        System.out.println(s);
    }
}