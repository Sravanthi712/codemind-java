import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        double r,A;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        A=3.14*r*r;
        System.out.format("%.2f",A);
    }
}