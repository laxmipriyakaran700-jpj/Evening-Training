public class rectangleofarea
{
    int rectangle(int l,int b)
    {
        return l*b;
    }
    public static void main(String[] args) {
        rectangleofarea obj=new rectangleofarea();
        System.out.println("Area of rectangle:"+obj.rectangle(4, 6));
    }
}