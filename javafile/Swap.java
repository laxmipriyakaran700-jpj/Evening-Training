public class Swap
{
public static void main(String arg[])
{
int a,b;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
System.out.println("before swapping");
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping");
System.out.println(" a="+a);
System.out.println(" b="+b);
}
}

