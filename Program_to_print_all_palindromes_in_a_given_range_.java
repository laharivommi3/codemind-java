import java.util.Scanner;
class Main
{
    public static boolean isPalindrome(int n)
    {
         int temp=n;
         int sum=0,r;
         while(n>0)
         {
             r=n%10;
             sum=sum*10+r;
             n=n/10;
         }
         if(temp==sum)
         return true;
         else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
          if(isPalindrome(i))
          System.out.print(i+" ");
        }
    }
}