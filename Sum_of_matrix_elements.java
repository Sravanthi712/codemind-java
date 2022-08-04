

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int a,b,i,j;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int [][]arr=new int [a][b];
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int s=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                s+=arr[i][j];
            }
        }
        System.out.println(s);
    }
}

