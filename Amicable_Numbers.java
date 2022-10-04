import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,sum1=0,sum2=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<=(int)m/2;i++)
        {
            if(m%i==0)
            sum1=sum1+i;
        }
        for(int i=1;i<=(int)n/2;i++)
        {
            if(n%i==0)
            sum2=sum2+i;
        }
        if(m==sum2 && n==sum1)
        System.out.println("Amicable");
        else 
        System.out.println("Not Amicable");
    }
}