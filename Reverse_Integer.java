import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,n;
        n=sc.nextInt();
        int a=n;
        n=Math.abs(n);
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(a<0)
        System.out.println("-"+sum);
        else
        System.out.println(sum);
    }
}