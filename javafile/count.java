public class count
{
    public static void main(String[] args) {
        int n=10;
        int count=0;
        while(n>0)
        {
            count=count+1;
            n=n/10;
        }
        System.out.println(count);
    }
}