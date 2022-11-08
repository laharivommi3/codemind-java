import java.util.Scanner;
import java.lang.String;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s1=sc.nextLine();
        String a="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            a=ch+a;
        }
        if(s1.contains(a))
        {
            if(s1.length()%2==0)
            {
            System.out.println("YES EVEN");
            }
            else
            {
            System.out.println("YES ODD");
            }
        }
        else
        System.out.println("NO");
        }
    }
}