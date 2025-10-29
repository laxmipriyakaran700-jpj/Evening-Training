interface A
{
    void s();
}
interface B
{
    void s1();
}
class C implements A,B
{
    public void s()
    {
        System.out.println("I am in c class");
    }
    public void s1()
    {
        System.out.println("I am in s1 method");
    }
}
public class vvvv
{
    public static void main(String[] args) {
        C obj=new C();
        obj.s();
        obj.s1();
    }
}