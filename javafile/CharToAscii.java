
import java.util.Scanner;

public class CharToAscii
{
    public static void main(String[] args) 
    {
        char c1,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character c1,c2");
        c1=sc.next().charAt(0);
        c2=sc.next().charAt(0);
        int ascii=(int)c1;
         ascii=(int)c2;
        int sum=ascii+ascii;
        System.out.println("ASCII of c1="+ascii);
         System.out.println("ASCII of c2="+ascii);
        System.out.println("addition of ASCII values="+sum);
    }
}