
import java.util.Scanner;

public class Suni
{
    public static void main(String[] args)
     {
        String s,a;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the string value");
        s=sc.next();
        a=sc.next();
        System.out.println(s==a);
        System.out.println(s!=a);
    }
}