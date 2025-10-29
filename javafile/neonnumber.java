
import java.util.Scanner;

public class neonnumber
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        int sq=n*n;
        int sum=0;
        while(sq>0)
        {
            sum=sum+(sq%10);
            sq=sq/10;
        }
        if(sum==n)
        {
            System.out.println("It is neon");
        }
        else{
            System.out.println("It is not neon");
        }
    }
}