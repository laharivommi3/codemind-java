import java.util.Scanner;
class Main
{
    public static boolean isPalindrome(int n)
    {
        int r,sum=0,temp=n;
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
        int n,n1=0,n2=0;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isPalindrome(i))
            {
            n1=i;
            break;
            }
        }
        for(int j=n-1;;j--)
        {
            if(isPalindrome(j))
            {
            n2=j;
            break;
            }
        }
        if(n-n2==n1-n)
        System.out.println(n2+" "+n1);
        else if(n1-n>n-n2)
        System.out.println(n2);
        else
        System.out.println(n1);
    }
}