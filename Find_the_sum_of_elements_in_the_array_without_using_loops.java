

import java.util.Scanner;

class pavan
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i;
        int [] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(i=0;i<n;i++)
        {
            s+=arr[i];
        }
        if(n>=1 && n<=30)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println("Enter a valid Number");
        }
    }
}