

import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(float)(a*b);
        System.out.printf("%.2f",c);
    }
}