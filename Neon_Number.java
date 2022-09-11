import java.util.Scanner;
class Main
{
    public static boolean isNeon(int x)
    {
        int temp=x,sum=0;
        x=x*x;
        while(x>0)
        {
            sum=sum+x%10;
            x=x/10;
        }
        if(sum==temp)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isNeon(n))
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}