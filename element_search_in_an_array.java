import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,m,i,res=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==m)
            {
            res=1;
            break;
            }
        }
        if(res==1)
        System.out.println("True");
        else 
        System.out.println("False");
    }
}