
import java.util.Scanner;

public class salary
{
    public static void main(String[] args) 
    {
        double salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=sc.nextDouble();
        String gender;
        System.out.println("Enter gender:");
        gender=sc.next();
        double bonus=0,commission=0;
        if(salary<15000)
        {
            bonus=salary*0.20;
            commission=salary*0.065;
            if(gender.equals("female"))
            {
                bonus+=salary*0.013;
                commission+=salary*0.0075;
            }
        }
        else if(salary>=15000 && salary<=30000)
        {
            bonus=salary*0.15;
            commission=salary*0.037;
            if(gender.equals("female"))
            {
                bonus+=salary*0.013;
                commission+=salary*0.0075;
            }
        }
        else if(salary>30000 && salary<100000)
        {
            bonus+=salary*0.015;
            commission=0;
        }
        else
        {
            bonus=0;
            commission=0;
        }
        double totalsalary=salary+bonus+commission;
        System.out.println("salary:"+salary);
        System.out.println("Bonus:"+bonus);
        System.out.println("commission:"+commission);
        System.out.println("totalsalary:"+totalsalary);
    }
}