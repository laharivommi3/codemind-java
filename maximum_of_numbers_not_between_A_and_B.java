import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,a,b,max,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        max=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            continue;
            else
            {
                if(x[i]>max)
                max=x[i];
                count++;
            }
        }
        if(count<=0)
        System.out.println("-1");
        else
        System.out.println(max);
    }
}