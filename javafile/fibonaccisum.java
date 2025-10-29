public class fibonaccisum
{
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1,temp,sum=0;
        System.out.println(a+""+b);
        while(true)
        {
            temp=a+b;
            if(temp%2==0)
                sum=sum+temp;
            if(temp>=n)
                break;
            a=b;
            b=temp;
            System.out.println(""+temp);    
        }
        System.out.println("sum="+sum);
    }
}