import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],y[],i,sum[];
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        sum=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        y[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum[i]=x[i]+y[i];
            System.out.print(sum[i]+" ");
        }
        
    }
}