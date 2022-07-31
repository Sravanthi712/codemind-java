

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%3==0 && n%5==0 && n%7==0)
        {
            System.out.println("PlingPlangPlong");
        }
        if(n%3==0 && n%5==0 && n%7!=0)
        {
            System.out.println("PlingPlang");
        }
        if(n%3==0 && n%5!=0 && n%7==0)
        {
            System.out.println("PlingPlong");
        }
        if(n%3!=0 && n%5==0 && n%7==0)
        {
            System.out.println("PlangPlong");
        }
        if(n%3==0 && n%5!=0 && n%7!=0)
        {
            System.out.println("Pling");
        }
        if(n%3!=0 && n%5==0 && n%7!=0)
        {
            System.out.println("Plang");
        }
        if(n%3!=0 && n%5!=0 && n%7==0)
        {
            System.out.println("Plong");
        }
        if(n%3!=0 && n%5!=0 && n%7!=0)
        {
            System.out.println(n);
        }
    }
}
