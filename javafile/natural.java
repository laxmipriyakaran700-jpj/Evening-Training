

public class natural
{
    void natural(int n)
    {
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=i+1;
        }
        int sum=0;
        System.out.println("numbers:");
        for(int a:arr1)
        {
            System.out.println(a);
            sum=sum+a;
        }
        System.out.println("sum="+sum);
    }
    public static void main(String[] args) {
        natural obj=new natural();
        obj.natural(10);
    }
}
