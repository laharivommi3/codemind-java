import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c1=0,c2=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                c1++;
               if(i%2!=0)
                   c2++;
            }
        }
        if(c1==c2)
        System.out.println("True");
        else
        System.out.println("False");
    }
}