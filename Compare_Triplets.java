

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int [] a=new int [4];
        int [] b=new int [4];
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<3;i++)
            a[i]=sc.nextInt();
        for(j=0;j<3;j++)
            b[j]=sc.nextInt();
        int c1=0,c2=0;
        for(i=0;i<3;i++)
            if(a[i]>b[i])
                c1++;
            else if(b[i]>a[i])
                c2++;
        System.out.printf("%d %d",c1,c2);
    }
}