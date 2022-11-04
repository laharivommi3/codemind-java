import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum1=0,sum2=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n/2;i++)
        {
            sum1=sum1+x[i];
        }
        for(i=n/2;i<n;i++)
        {
            sum2=sum2+x[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}