import java.util.Scanner;
class Main
{
    public static boolean isPrime(int n)
    {
        int count=0;
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
        int n1,n2,c=0,sum;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        for(int i=sum+1; ;i++)
        {
            c++;
            if(isPrime(i))
            break;
        }
        System.out.println(c);
    }
}