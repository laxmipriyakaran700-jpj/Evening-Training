
//By using if-else condition
import java.util.Scanner;

public class Vote
{
    public static void main(String[] args) 
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for age");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Ready for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }
    }
}