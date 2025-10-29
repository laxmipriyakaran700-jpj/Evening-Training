
import java.util.Scanner;

public class nandu
{
    public static void main(String[] args)
     {
        double d1,d2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of d1,d2");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        int a=(int)d1;
        int b=(int)d2;
        int c=(a*a)+(b*b);
        System.out.println("addition of squre of two integer values="+c);
    }
}