public class star16
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                for(int k=1;k<=(2*i-1);k++)
                {
                    if(j==1||i==1||k==1||j==5||i==5||k==5)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}