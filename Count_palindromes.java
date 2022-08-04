

import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int n,i,q,r,s,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            q=arr[i];
            s=0;
            while(q!=0)
            {
                r=q%10;
                s=s*10+r;
                q/=10;
            }
            if(s==arr[i])
            {
                c++;
            }
        }
        System.out.print(c);
    }
}