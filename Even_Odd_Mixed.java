import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,e=0,o=0,d,r;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            e++;
            else
            o++;
            n=n/10;
        }
        if(e>=1 && o>=1)
        System.out.println("Mixed");
        else if(d==e)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}