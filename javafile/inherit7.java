
import java.util.Scanner;

class Employee
{
    String e_nm;
    int e_id;
    Scanner sc=new Scanner(System.in);
}
class dept extends Employee
{
    String d_nm;
    double salary;
    void in()
    {
        System.out.println("Enter the name of the employee:");
        e_nm=sc.next();
        System.out.println("Enter the e_id:");
        e_id=sc.nextInt();
        System.out.println("Enter the dept name:");
        d_nm=sc.next();
        System.out.println("Enter the amount of salary:");
        salary=sc.nextDouble();
    }
    void dis()
    {
        System.out.println(e_nm);
        System.out.println(e_id);
        System.out.println(d_nm);
        System.out.println(salary);
    }
}
public class inherit7
{
    public static void main(String[] args) {
        sec obj=new sec();
        obj.in();
        obj.show();
    }
}