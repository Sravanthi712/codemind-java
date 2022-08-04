

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int k,l;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        for(l=0;l<k;l++)
        {
            int a,b,i,j;
            a=sc.nextInt();
            b=sc.nextInt();
            int []a1=new int[a];
            int []a2=new int[b];
            int []a3=new int[a+b];
            for(i=0;i<a;i++)
            {
                a1[i]=sc.nextInt();
            }
            for(j=0;j<b;j++)
            {
                a2[j]=sc.nextInt();
            }
            for(i=0;i<a;i++)
            {
                a3[i]=a1[i];
            }
            for(j=0;j<b;j++)
            {
                a3[j+a]=a2[j];
            }
            int temp;
            for(i=0;i<a+b;i++)
            {
                for(j=i+1;j<a+b;j++)
                {
                    if(a3[i]>a3[j])
                    {
                        temp=a3[i];
                        a3[i]=a3[j];
                        a3[j]=temp;
                    }
                }
            }
            for(i=0;i<a+b;i++)
            {
                if(i!=a+b-1)
                    System.out.printf("%d ",a3[i]);
                else
                    System.out.printf("%d",a3[i]);
            }
            System.out.printf("
");
        }
    }
}
