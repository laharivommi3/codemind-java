import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,a,b,min,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        min=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                if(x[i]>min)
                min=x[i];
                c++;
            }
        }
        if(c<=0)
        System.out.println("-1");
        else
        System.out.println(min);
    }
}