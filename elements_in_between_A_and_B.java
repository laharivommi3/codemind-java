import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,A,B,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        for(i=0;i<n;i++)
        {
        if(x[i]>=A && x[i]<=B)
          {
           count++;
           System.out.print(x[i]+" ");
          }
        }
        if(count==0)
        System.out.println("-1");
    }
}