import java.util.Scanner;
class Main
{
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
    public static boolean isStrong(int n)
    {
        int r,sum=0;
        int temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+fact(r);
            temp/=10;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isStrong(n))
        System.out.println("The number "+n+" is a strong number");
        else
        System.out.println("The number "+n+" is not a strong number");
    }
}