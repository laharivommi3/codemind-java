import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,x,y;
        t=sc.nextInt();
        while(t-->0)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x+y);
        }
    }
}