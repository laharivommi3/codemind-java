import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,cap,total;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        cap=2*s*t*b*512;
        total=cap/1024;
        System.out.println(total+"KB");
    }
}