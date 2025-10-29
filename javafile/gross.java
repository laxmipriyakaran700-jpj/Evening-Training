public class gross
{
public static void main(String arg[])
{
double basic,TA,DA,HRA,gross;
basic=Double.parseDouble(arg[0]);
System.out.println("Enter basic salary");
TA=0.05*basic;
DA=0.07*basic;
HRA=0.02*basic;
gross=basic+TA+DA+HRA;
System.out.println("gross="+gross);
}
}