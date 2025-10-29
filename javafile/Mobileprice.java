import java.util.Scanner;
public class Mobileprice
{
    public static void main(String[] args)
    {
        String company;
        int price;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mobile  company name:");
        company=sc.next();
        System.out.println("Enter the price value");  
        price=sc.nextInt();
        if(price>200000)
        {
            System.out.println("Mobile company:SAMSUNG");
            System.out.println("Features:256GB storage,12GB RAM,Foldable Display,5G support");
        }
        else
        {
            System.out.println("Mobile company:Other brand");
            System.out.println("Features:Standard Display,4G support,64GB storage");
        }
    }
}