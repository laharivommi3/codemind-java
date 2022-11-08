import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1+s2;
        //System.out.println(s3);
        char ch[]=s3.toCharArray();
        //for(int i=0;i<s3.length();i++)
        //System.out.print(ch[i]+" ");
        Arrays.sort(ch);
        for(int i=0;i<s3.length();i++)
        System.out.print(ch[i]);
    }
}