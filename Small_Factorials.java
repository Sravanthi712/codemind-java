

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,j,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int [n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(i=0;i<n;i++)
        {
            c=1;
            for(j=1;j<=arr[i];j++)
            {
                c=c*j;
            }
            System.out.printf("%d
",c);
        }
    }
}

