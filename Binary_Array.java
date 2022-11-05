import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==0 || x[i]==1)
            {
                c++;
            }
        }
        if(c==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}