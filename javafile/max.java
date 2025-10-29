public class max
{
    int max(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            return a;
        }    
        else if(b>=a && b>=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void main(String[] args) {
        max obj=new max();
        System.out.println(obj.max(15,30,25));
    }
}