
import java.util.Scanner;

public class myloop
{
    public static void main(String[] args) 
    {
        int i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        n=sc.nextInt();
        while(i<n)
        {
            System.out.println(i);
            i++;
        }
    }
}