
import java.util.Scanner;

public class ATMProcess
{
    public static void main(String[] args)
    {
        double amount,balance=10000;
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("\nYour choices are\n 1.withdraw\n 2.deposit\n");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter the amount for withdraw:");
            amount=sc.nextDouble();
            if(amount<=balance)
            {
                balance-=amount;
                System.out.println("withdrawal successfull");
                System.out.println("Remaining balance:"+balance);
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else if(choice==2)
        {
            System.out.println("Enter amount for deposit:");
            amount=sc.nextDouble();
            balance+=amount;
            System.out.println("Deposit successfull");
            System.out.println("Updated balance:");
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
