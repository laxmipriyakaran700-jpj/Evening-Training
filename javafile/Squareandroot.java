
import java.util.Scanner;

public class Squareandroot
{
    public static void main(String[] args)
     {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("sum="+sum);
        System.out.println("sub="+sub);
        System.out.println("mul="+mul);
        System.out.println("div="+div);
        System.out.println("square of the sum="+(sum*sum));
        System.out.println("square of the sub="+(sub*sub));
        System.out.println("square of the mul="+(mul*mul));
        System.out.println("square of the div="+(div*div));
        System.out.println("squareroot of sum="+Math.sqrt(sum));
        System.out.println("squareroot of sub="+Math.sqrt(sub));
        System.out.println("squareroot of mul="+Math.sqrt(mul));
        System.out.println("squareroot of div="+Math.sqrt(div));
    }
}