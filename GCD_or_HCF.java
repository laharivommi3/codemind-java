import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,min=0,gcd=0;
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<n)
        min=m;
        else
        min=n;
        for(int i=min;i>0;i--)
        {
            if(m%i==0 && n%i==0)
            {
                gcd=i;
                break;
            }
        }
       System.out.println(gcd); 
       sc.close();
    }
}