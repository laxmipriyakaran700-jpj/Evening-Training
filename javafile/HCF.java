public class HCF
{
    public static void main(String[] args) {
        int a=4,b=2;
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}