import java.util.Scanner;
class Main
{
    public static boolean isPalindrome(int n)
    {
        int temp=n,rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isPalindrome(x[i]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}