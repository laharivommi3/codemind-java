import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,sum1=0,sum2=0,res;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            sum1=sum1+x[i];
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            sum2=sum2+x[i];
        }
       res=Math.abs(sum1-sum2);
       System.out.println(res);
    }
}