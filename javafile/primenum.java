public class primenum
{
    public static void main(String[] args) {
        int n=20; 
        int i,j;
        for(i=2;i<=n;i++)
        {
            boolean flag=true;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                { 
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.println(i);
            }
        }
    }
}