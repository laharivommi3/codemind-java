import java.util.Scanner;
class Strings
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   String s1=sc.nextLine();
   int v=0,c=0,d=0,s=0;
   for(int i=0;i<s1.length();i++)
   {
    char ch=s1.charAt(i);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      v++;
    else if(ch>=48 && ch<=57)
      d++;
    else if(ch==' ')
      s++;
    else 
      c++;
    }
    System.out.println("Vowels: "+v);
    System.out.println("Consonants: "+c);
    System.out.println("Digits: "+d);
    System.out.println("White spaces: "+s);
  }
}