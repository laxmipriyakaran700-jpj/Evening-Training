
import java.util.Scanner;

class Employee
{
    private String name;
    private int id;
    private double basicsalary;
    private double hra;
    private double da;
    private double grosssalary;
    void grosssal()
    {
        grosssalary=basicsalary+hra+da;
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("basicsalary:"+basicsalary);
        System.out.println("hra:"+hra);
        System.out.println("da:"+da);
        System.out.println("grosssalary:"+grosssalary);
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        name=sc.next();
        System.out.println("Enter employee id:");
        id=sc.nextInt();
        System.out.println("Enter employee basic salary:");
        basicsalary=sc.nextDouble();
        System.out.println("Enter hra:");
        hra=sc.nextDouble();
        System.out.println("Enter da:");
        da=sc.nextDouble();
    }
}
public class mygross
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        emp.input();
        emp.grosssal();
        emp.display();
    }
}