import java.util.Scanner;
class Main
{
    public static boolean isPrime(int n)
    {
        int count=0;
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    for(int i=m+1;i<=n;i++)
    {
        if(isPrime(i))
        System.out.println(i);
    }
    }
}