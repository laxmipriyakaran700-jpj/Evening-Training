
import java.util.Scanner;

public class automorphicrange
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr value for n: ");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int m=i;
            int digit=0;
            while(m!=0)
            {
                m=m/10;
                digit++;
            }
            int square=i*i;
            int temp=(int)Math.pow(10,digit);
            int result=square%temp;
            if(i==result)
            {
                System.out.println(i);
            }
        }
    }
}