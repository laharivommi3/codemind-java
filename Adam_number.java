import java.util.Scanner;
class Main
{
    public static int isReverse(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq1,sq2,res1,res2;
        n=sc.nextInt();
        sq1=n*n; //144
        res1=isReverse(n); //21
        sq2=res1*res1; //441
        res2=isReverse(sq2); //144
        if(sq1==res2)
        {
        System.out.println("True");
        }
        else
        {
        System.out.println("False");
        }
    }
}