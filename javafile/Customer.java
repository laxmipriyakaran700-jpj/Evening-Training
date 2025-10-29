
import java.util.Scanner;

public class Customer
{
    public static void main(String[] args)
     {
        String name,product;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name,product name");
        name=sc.next();
        product=sc.next();
        System.out.println("Enter quantity");
        int qty=sc.nextInt();
        System.out.println("Enter price per item");
        double price=sc.nextDouble();
        double total=qty*price;
        System.out.println("customer:"+name);
        System.out.println("product:"+product);
        System.out.println("total :"+total);
     }
 }
