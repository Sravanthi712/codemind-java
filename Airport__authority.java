

import java.util.Scanner;

class sravanthi
{
    public static void main(String args[])
    {
        int n,k,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                c=c+1;
            }
            else
            {
                c=c+2;
            }
        } 
        System.out.println(c);
    }
}

