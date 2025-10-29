public class Papu
{
public static void main(String arg[])
{
double basic,ta,hra,gross;
basic=Double.parseDouble(arg[0]);
System.out.println("Enter basic salary");
ta=0.02*basic;
hra=0.04*basic;
gross=basic+ta+hra;
System.out.println("gross="+gross);
}
}
