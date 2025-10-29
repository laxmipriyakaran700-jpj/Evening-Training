
import java.util.Scanner;

public class sumaverage
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        float avg=(float)sum/n; 
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }
}