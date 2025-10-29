
import java.util.Scanner;

public class BTechAdmission
{
    public static void main(String[] args) 
    {
        int rank;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your entrance exam rank:");
        rank=sc.nextInt();
        if(rank>=5000)
        System.out.println("You will get admission in Government college");
        else
        System.out.println("You will get admission in Private college");
    }
}