
import java.util.Scanner;

class employee
{
    String e_nm;
    Scanner sc=new Scanner(System.in);
}
class dept extends employee
{
    String d_nm;
}
class sec extends dept
{
    String s_nm;
    void in()
    {
        System.out.println("Enter the name of the Employee:");
        e_nm=sc.next();
        System.out.println("Enter the name of the dept:");
        d_nm=sc.next();
        System.out.println("Enter the name of the sec:");
        s_nm=sc.next();
    }
    void show()
    {
        System.out.println(e_nm);
        System.out.println(d_nm);
        System.out.println(s_nm);
    }
}
public class inherit6
{
    public static void main(String[] args) {
        sec obj=new sec();
        obj.in();
        obj.show();
    }
}