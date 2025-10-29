public class Armstrongrange
{
    public static void main(String[]args)
    {
        System.out.println("Armstrog value from 1 to 1000:");
        for(int num=1;num<=1000;num++)
        {
            int temp=num;
            int sum=0;
            int digit=0;
            int n=temp;
            while(n>0)
            {
                digit++;
                n=n/10;
            }
            n=temp;
            while(n>0)
            {
                int r=n%10;
                sum +=Math.pow(r,digit);
                n=n/10;
            }
            if(sum==num)
            {
                System.out.println(num);
            }
        }
    }
}
