import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        System.out.println(((l+2*w)*(b+2*w)-l*b)*c);
    }
}