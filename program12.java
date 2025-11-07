public class program12
{
    public static void main(String[] args) {
        int arr[]={5,3,1,6,9,7,8};
        int length=arr.length;
        int maxprofit=0;
        int min=arr[0];
        for(int i=1;i<length;i++)
        {
            min=Math.min(min,arr[i]);
            maxprofit=Math.max(maxprofit,arr[i]-min);
        }
        System.out.println("maximum profit=" +maxprofit);
        System.out.println("minimum profit="+min);
    }
}