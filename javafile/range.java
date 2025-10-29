public class range
{
    public static void main(String[] args) {
        int start=2;
        int end=6;
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}