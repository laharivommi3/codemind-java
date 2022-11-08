import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.nextLine();
        while(n>0)
        {
            
            String s=sc.nextLine();
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch>=48 && ch<=57)
                c++;
            }
            if(c>0)
            System.out.println("Yes");
            else
            System.out.println("No");
            n--;
        }
    }
}