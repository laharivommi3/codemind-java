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
        int m,n;
        m=sc.nextInt();
        if(m==1)
          m=2;
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
          if(isPrime(i))
          System.out.println(i);
        }
    }
}