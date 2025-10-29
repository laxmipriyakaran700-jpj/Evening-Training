
import java.util.Scanner;

public class armstrong
{
    public static void main(String[] args) {
        int n=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        int range=1000;
        for(int i=1;i<=range;i++)
        {
            int t=n;
            int digit=0;
            int sum=0;
            while(t>0)
            {
                t=t/10;
                digit++;
            }
            System.out.println(digit);
            t=n;
            while(t>0)
            {
                int r=t%10;
                sum=sum+(int)Math.pow(r,digit);
                t=t/10;
            }
            if(sum==n)
            {
            System.out.println(n);
            }
        }
    }
}