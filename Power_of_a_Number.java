import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,p,res;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=(int)Math.pow(a,b);
        res=p%c;
        System.out.println(res);
    }
}