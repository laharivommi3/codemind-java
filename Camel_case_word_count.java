import java.util.Scanner;
import java.lang.String;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            {
            c++;
            }
        }
        System.out.println(c);
    }
}