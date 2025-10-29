class parent
{
    void show()
    {
        System.out.println("I am in parent class");
    }
}
class child extends parent
{
    void dis()
    {
        show();
        System.out.println("I am in child class");
    }
}
public class inherit3
{
    public static void main(String[] args) {
        child obj=new child();
        obj.dis();
    }
}