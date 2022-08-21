

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int a,b,c,d,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        i=(int)Math.pow(a,b);
        d=i%c;
        System.out.printf("%d",d);
    }
}