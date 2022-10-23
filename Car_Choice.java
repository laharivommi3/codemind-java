import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        float a,b,c,d;
        t=sc.nextInt();
        while(t-->0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if(c/a < d/b)
            System.out.println("-1");
            else if(c/a==d/b)
            System.out.println("0");
            else
            System.out.println("1");
        }
    }
}