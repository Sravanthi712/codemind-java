

import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=2*512*a*b*c;
        System.out.printf("%d",d);
    }
}

