import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0,even=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[0]%2!=0)
            {
                break;
            }
            else
            {
            sum=sum+x[i];
            if(x[i]%2!=0)
            {
               even=x[i];
               break;
            }
            }
        }
        System.out.println(sum-even);
    }
}