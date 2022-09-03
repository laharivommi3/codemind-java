import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hf,sf1,sf2;
        hf=sc.nextInt();
        sf1=sc.nextInt();
        sf2=sc.nextInt();
        if(hf>50 && sf1>60 && sf2>100)
        System.out.println("10");
        else if(hf>50 && sf1>60)
        System.out.println("9");
        else if(sf1>60 && sf2>100)
        System.out.println("8");
        else if(hf>50 && sf2>100)
        System.out.println("7");
        else if(hf>50 || sf1>60 || sf2>100)
        System.out.println("6");
        else
        System.out.println("5");
        
        
    }
}