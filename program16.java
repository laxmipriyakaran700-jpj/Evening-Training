public class program16
{
    public static void main(String arg[])
    {
        int arr[]={4,3,2,1};
        int length=arr.length;
        int pivot=-1;
        for(int i=length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
            int start=0;
            int end=length-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            System.out.println("pivot index is :"+pivot);
        }
        else
        {
            for(int i=length-1;i>=pivot;i--)
            {
                if(arr[i]>arr[pivot])
                {
                    int temp=arr[i];
                    arr[i]=arr[pivot];
                    arr[pivot]=temp;
                    break;
                }
            }
            int start=pivot+1;
            int end=length-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            for(int i=0;i<length;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}