
import java.util.Scanner;

public class neonrange
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int square=i*i;
            int sum=0;
            int temp=square;
            while(temp>0)
            {
                sum=sum+(temp%10);
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}