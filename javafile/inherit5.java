class A
{
    int x=2;
}
class B extends A
{
    int y=4;
}
class C extends B
{
    int z=6;
    void show()
    {
        int sum=x+y+z;
        System.out.println("sum="+sum);
    }
}
public class inherit5
{
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
    }
}