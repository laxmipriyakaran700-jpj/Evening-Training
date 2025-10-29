public class fibonacci
{
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        int temp;
        System.out.println(a+""+b);
        while(a<=n)
        {
            temp=a+b;
            if(temp>n)
                break;
            a=b;
            b=temp;
            System.out.println(""+temp);
        }
    }
}