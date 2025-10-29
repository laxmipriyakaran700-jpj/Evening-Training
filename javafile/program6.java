public class program6
{
    public static void main(String arg[])
    {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int length=arr.length;
        int n=5;
        int count=0;
        for(int i=0;i<length;i++)
        {
            if(n==arr[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}