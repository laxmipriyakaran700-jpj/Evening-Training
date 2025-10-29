
import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String[] args)
     {
       float r;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of r");
       r=sc.nextFloat();
       double radius=(double)r;
       double area=3.141*r*r;
       System.out.println("area of the circle is="+area);
    }
}