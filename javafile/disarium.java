public class disarium
{
    public static void main(String[] args) {
        int num=135;
        int temp=num;
        int sum=0;
        int len=String.valueOf(num).length();
        while(temp>0)
        {
            int digit=temp%10;
            sum+=Math.pow(digit,len);
            len--;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num +   "disarium");
        }
    }
}