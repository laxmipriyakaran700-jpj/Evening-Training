
import javax.lang.model.util.ElementScanner14;

public class program7
{
    public static void main(String[] args) {
        int arr[]={10,20,60,40,30,60,60,70,70,70,70,80,98};
        int length=arr.length;
        int second=-1;
        int large=-1;
        for (int i=0;i<length;i++)
        {
            if(arr[i]>large)
            {
                second=large;
                large=arr[i];
            }
            else if(arr[i]>second && arr[i]!=large)
            {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}