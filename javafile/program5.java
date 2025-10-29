public class program5
{
    public static void main(String[] args) {
        int arr[]={10,5,9,8,7,6};
        int length=arr.length;
        int flag=0;
        int n=9;
        for(int i=0;i<length;i++)
        {
            if(n==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("search is not found");
        }
    }
}