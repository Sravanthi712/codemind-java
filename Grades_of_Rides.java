

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>50 && b>60 && c>100)
        {
            System.out.printf("10");
        }
        else if(a>50 && b>60 && c<=100)
        {
            System.out.printf("9");
        }
        else if(a<=50 && b>60 && c>100)
        {
            System.out.printf("8");
        }
        else if(a>50 && b<=60 && c>100)
        {
            System.out.printf("7");
        }
        else if(a>50 && b<=60 && c<=100)
        {
            System.out.printf("6");
        }
        else if(a<=50 && b>60 && c<=100)
        {
            System.out.printf("6");
        }
        else if(a<=50 && b<=60 && c>100)
        {
            System.out.printf("6");
        }
        else if(a<=50 && b<=60 && c<=100)
        {
            System.out.printf("5");
        }
    }
}

