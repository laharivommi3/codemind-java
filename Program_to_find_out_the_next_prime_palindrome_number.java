import java.util.Scanner;
class Main
{
    public static boolean isPrime(int n)
    {
        int count=0;
        if(n<1)
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
    public static boolean isPalindrome(int n)
    {
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=n+1;;i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                break;
            }
        }
        System.out.println(i);
    }
}