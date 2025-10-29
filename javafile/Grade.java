
//By using else-if statement
import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
     {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for marks");
        marks=sc.nextInt();
        if( marks>=90)
        {
            System.out.println("Grade:O");
        }
        else if(marks>=80)
        {
            System.out.println("Grade:E");
        }
        else if(marks>=70)
        {
            System.out.println("Grade:A");
        }
        else if(marks>=60)
        {
            System.out.println("Grade:B");
        }
        else if(marks>=50)
        {
            System.out.println("Grade:C");
        }
        else if(marks>30)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Grade:Fail");
        }
    }
}