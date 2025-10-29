
import java.util.Scanner;

public class whileloop
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
          System.out.println("sum="+sum);
    }
}