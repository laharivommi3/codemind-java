import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        while(t>0)
        {
            int c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int i=a;i<=b;i++)
            {
                if((i%10==2) || (i%10==3) || (i%10==9))
                {
                c++;
                }
            }
            t--;
            System.out.println(c);
        }
    }
}
