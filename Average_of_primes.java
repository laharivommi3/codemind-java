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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int count=0;
        float sum=0,avg=0;
        for(i=0;i<n;i++)
        {
            if(isPrime(x[i]))
            {
            count++;
            sum=sum+x[i];
            }
        }
        avg=sum/count;
        System.out.format("%.2f",avg);
    }
}