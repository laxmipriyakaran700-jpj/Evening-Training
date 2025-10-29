class parent
{
    public 
    int x=2;
}
class child extends parent
{
    void sq()
    {
        System.out.println(x*x);
    }
}
public class inherit
{
    public static void main(String[] args) {
        child obj=new child();
        obj.sq();
    }
}