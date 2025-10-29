public class area
{
    void circle(double r)
    {
        double area=3.14*r*r;
        System.out.println("area of circle="+area);
    }
    void rectangle(double  l,double  b)
    {
        double area=l*b;
        System.out.println("area of rectangle="+area);
    }
    void square(double a)
    {
        double area=a*a;
        System.out.println("area of square="+area);
    }
    public static void main(String[] args) {
        area obj=new area();
        obj.circle(5);
        obj.rectangle(4, 6);
        obj.square(3);
    }
}