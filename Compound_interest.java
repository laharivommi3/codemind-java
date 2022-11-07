import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r,ci;
        p=sc.nextDouble();
        t=sc.nextDouble();
        r=sc.nextDouble();
        ci=p*Math.pow(1+t/100,r);
        System.out.format("%.2f",ci);
    }
}