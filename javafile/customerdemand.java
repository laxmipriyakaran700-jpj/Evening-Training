
import java.util.Scanner;
public class customerdemand
{
    public static void main(String[] args)
    {
        String demand;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product demand:");
        demand=sc.next();
        
        if(demand.equals("high"))
        {
            System.out.println("Increase production and supply more products");
        }
        else if(demand.equals("medium"))
        {
            System.out.println("Maintain current production level");
        }
        else if(demand.equals("low"))
        {
            System.out.println("Reduce production to avoid overstock");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}