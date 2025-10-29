import java.util.*;
public class perfectrange
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
