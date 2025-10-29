
import java.util.Scanner;

public class Discount
{
    public static void main(String[] args)
     {
        double price;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product price");
        price=sc.nextDouble();
        double discount=price*0.10;
        double finalprice=price-discount;
        System.out.println("price="+price);
        System.out.println("discount(10%)="+discount);
        System.out.println("Final price="+finalprice);
    }
}