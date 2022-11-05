import java.util.Scanner;
class Main
{
    public static boolean isPrime(int n)
    {
        int c=0;
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static int reverse(int n)
    {
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(!isPrime(n))
        System.out.println("not prime");
        else if(isPrime(n) && isPrime(reverse(n)))
        System.out.println("circular prime");
        else if(isPrime(n) && !isPrime(reverse(n)))
        System.out.println("prime but not a circular prime");
    }
}