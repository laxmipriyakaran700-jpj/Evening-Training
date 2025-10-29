class parent
{
    parent()
    {
        System.out.println("This is parent class constructor");
    }
}
class child extends parent
{

    child()
    {
        System.out.println("This is child class constructor");
    }
    
}
public class inherit4
{
    public static void main(String[] args) {
        child obj=new child();
    }
}k