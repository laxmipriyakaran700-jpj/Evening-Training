
import java.util.Scanner;

public class multiplication
{
    public static void main(String[] args) 
     {
        int n=3;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        for(i=1;i<=10;i++)
        {
            System.out.println("n="+(n*i));
        }
    }
}