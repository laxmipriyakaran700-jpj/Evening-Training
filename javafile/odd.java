
import java.util.Scanner;

public class odd
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n=sc.nextInt();
        int i=1;
        System.out.println("The no is odd");
        while(i<=n)
        {
            if(i%2!=0)
            { 
                System.out.println(i);
            }
            i++;
        }
    }
}