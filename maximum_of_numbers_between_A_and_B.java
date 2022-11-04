import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,a,b,max,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        max=x[0];
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                if(x[i]>max)
                max=x[i];
                c++;
            }
        }
        if(c<=0)
        System.out.println("-1");
        else
        System.out.println(max);
    }
}