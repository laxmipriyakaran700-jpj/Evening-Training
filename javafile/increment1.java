public class increment1
{
    public static void main(String[] args) 
    {
        int x=4;
        System.out.println("pre-increment:"+(++x));
        System.out.println("pre-decrement:"+(--x));
        System.out.println(++x+x--);
        System.out.println(x+++--x);
    }
}