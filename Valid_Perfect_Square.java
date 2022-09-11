import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            double d=Math.sqrt(n);
            if(d-(int)d>0)
            System.out.println("False");
            else
            System.out.println("True");
            t--;
        }
    }
}