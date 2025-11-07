public class program14
{
    public static void main(String arg[])
    {
        int arr[]={1,2,-3,5,6,-4,-5};
        int length=arr.length;
        int result=arr[0];
        int maxend=arr[0];
        for(int i=1;i<length;i++)
        {
            maxend=Math.max(maxend+arr[i],arr[i]);
            result=Math.max(result,maxend);
        }
        System.out.println(result);
    }
}