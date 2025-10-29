
import java.util.Scanner;

public class Feastarrangement
{
    public static void main(String[] args) 
    {
        int Friend;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of friends attending the feast:");
        Friend=sc.nextInt();
        if(Friend<=5)
        {
            System.out.println("order:snacks,juice");
        }
        else if(Friend>=7 && Friend<=10)
        {
            System.out.println("order:scanks,juice,Fish");
        }
        else if(Friend>=10 && Friend<=15)
        {
            System.out.println("order:scanks,juice,chicken");
        }
        else if(Friend>=15 && Friend<=20)
        {
            System.out.println("order:scanks,juice,motton");
        }
        else
        {
            System.out.println("Full feast,chicken,motton,fish,drinks,snacks");
        }
    }
}