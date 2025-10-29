
import java.util.Scanner;

public class Greatest
{
    public static void main(String[] args) 
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("The greatest number is:"+a);
        }
        else if(b>a)
r        {
            System.out.println("The greatest number is:"+b);
        }
        else
        {
            System.out.println("Both number is equal");
        }
    }
}