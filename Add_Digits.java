import java.util.Scanner;
class Main
{
    public static int AddDigits(int n)
    {
        int sum=0,r;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
           r=n%10;
           sum=sum+r;
           n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(AddDigits(n));
    }
}