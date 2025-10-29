public class program8
{
    public static void main(String[] args) {
        int arr[]={10,20,60,60,60,30,50,40,50,50,60};
        int length=arr.length;
        int first=-1;
        int second=-1;
        int third=-1;
        for (int i=0;i<length;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first && arr[i]!=third)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third && arr[i]!=first && arr[i]!=second)
            {
                third=arr[i];
            }
        }
        System.out.println(third);
    }
}