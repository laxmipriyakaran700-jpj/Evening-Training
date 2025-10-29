public class large
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int length=arr.length;
        int large=arr[0];
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}