import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int x[],i,n,count1=0,count2=0;
     n=sc.nextInt();
     x=new int[n];
     for(i=0;i<n;i++)
     {
     x[i]=sc.nextInt();
     }
     for(i=0;i<n;i++)
     {
     if(x[i]%2==0)
     count1++;
     else
     count2++;
   }
   System.out.println(count1+" "+count2);
   }
}