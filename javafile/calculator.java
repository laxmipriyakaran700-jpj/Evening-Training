public class calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    double multiply(double x,double y)
    {
        return x*y;
    }
    float division(float p,float q)
    {
        return p/q; 
    }
    public static void main(String[] args) {
        calculator obj=new calculator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.multiply(4.5,3.2));
        System.out.println(obj.division(20,5));
    }
}