public class areaofcon
{
    double area;
    areaofcon(double r)
    {
        area=3.14*r*r;
        System.out.println("area of circle:"+area);
    }
    areaofcon(double l,double b)
    {
        area=l*b;
        System.out.println("area of rectangle:"+area);
    }
    areaofcon(double a,double h)
    {
        area=0.5*a*h;
        System.out.println("area of triangle:"+area);
    }
    public static void main(String[] args) 
    {
        areaofcon ob=new areaofcon(4.2);
        areaofcon ob1=new areaofcon(2.5,1.5);
        areaofcon ob2=new areaofcon(3.5d,4.4d);
    }
}