import java.util.Scanner;
import java.lang.String;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(s1.replace(".","[.]"));
    }
}