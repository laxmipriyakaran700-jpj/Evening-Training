
import java.util.Scanner;

public class program
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        int digit=0;
        int sum=0;
        int t=n;
        while(t!=0)
        {
            t=t/10;
            digit++;
        }
        System.out.println(digit);
        t=n;
        while(t!=0)
        {
            int r=t%10;
            sum=sum+(int)Math.pow(r,digit);
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("the no is armstrong");
        }
        else
        {
            System.out.println("the no is not armstrong");
        }
    }
}