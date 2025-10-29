class parent
{
    private int x=2;
    public int y=4;
    protected int z=6;
    public
    void s()
    {
        System.out.println(x);
    }
}
class child extends parent
{
    void show()
    {
        s();
        System.out.println(y);
        System.out.println(z);
    }
}
public class inherit1
{
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
    }
}