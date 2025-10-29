
import java.util.Scanner;

public class automorphic
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        int m=n;
        int digit=0;
        while(m!=0)
        {
            m=m/10;
            digit++;
        }
        int square=n*n;
        int temp=(int)Math.pow(10,digit);
        int result=square%temp;
        if(n==result)
        {
            System.out.println("It is an automorphic");
        }
        else{
            System.out.println("It is not an automorphic");
        }
    }
}