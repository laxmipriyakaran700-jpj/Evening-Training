public class neon
{
    public static void main(String[] args) {
        int n=10;
        int square=n*n;
        int sum=0;
        while(square>0)
        {
            sum=sum+(square%10);
            square=square/10;
        }
        if(sum==n)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Not neon");
        }
    }
}