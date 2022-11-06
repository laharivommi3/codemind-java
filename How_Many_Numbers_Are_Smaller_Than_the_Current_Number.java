import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<n;j++)
            {
                if(x[j]<x[i])
                c++;
            }
            System.out.print(c+" ");
        }
    }
}