
import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args) 
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("this ia a leap year:"+year);
        }
        else
        {
            System.out.println("this is not a leap year:"+year);
        }
    }
}