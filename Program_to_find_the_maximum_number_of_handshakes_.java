

import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int s=0;
        for(int i=1;i<a;i++)
             s=s+i;
        System.out.println(s);     
    }
}