import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int max=x[0];
        for(i=0;i<n;i++)
        {
            if(x[i]>max)
            max=x[i];
        }
        System.out.println(max);
    }
}