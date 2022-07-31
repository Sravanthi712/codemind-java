

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=1 && n<=12)
        {
            if(n==2||n==3)
            {
                System.out.println("Spring");
            }
            else if(n>=7 && n<=11)
            {
                System.out.println("Rainy");
            }
            else if(n>=4 && n<=6)
            {
                System.out.println("Summer");
            }
            else
            {
                System.out.println("Winter");
            }
        }
        else
        {
            System.out.printf("-1");
        }
    }
}
