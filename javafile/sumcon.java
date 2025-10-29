public class sumcon
{
    sumcon(int x,int y)
    {
        System.out.println("sum="+(x+y));
    }
    sumcon(int x,int y,int z)
    {
        System.out.println("sum="+(x+y+z));
    }
    sumcon(int x,float y)
    {
        System.out.println("sum="+(x+y));
    }
    public static void main(String[] args) {
        sumcon obj=new sumcon(2,3);
        sumcon obj1=new sumcon(2,3,4);
        sumcon obj2=new sumcon(2,3.4f);
    }
}