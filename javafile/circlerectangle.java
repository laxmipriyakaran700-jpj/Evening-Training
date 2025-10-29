public class circlerectangle
{
    double rectangle(double l,double b)
    {
        return l*b;
    }
    double circle(double r)
    {
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        circlerectangle obj=new circlerectangle();
        System.out.println("area of rectangle:"+obj.rectangle(12.0,6.0));
        System.out.println("area of circle:"+obj.circle(7.0));
    }
}  