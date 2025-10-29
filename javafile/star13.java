public class star13
{
    public static void main(String[] args) {
        for(int i = 1;i <= 4;i++)
        {
            for(int j = i;j <= 4;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++)
            {
                System.out.print(i + " " );
            }
            System.out.println( );
        }  
        for(int i=3;i>=1;i--)
        {
            for(int j=i;j<=4;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i + " " );
            }
            System.out.println();
        }
    }
}