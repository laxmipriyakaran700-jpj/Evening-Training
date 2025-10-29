public class studentcon
{
    int roll;
    String name;
    studentcon(int r,String n)
    {
        roll=r;
        name=n;
    }
    void show()
    {
        System.out.println("roll:"+roll);
        System.out.println("name:"+name);
    }
    public static void main(String[] args)
    {
        studentcon arr[]=new studentcon[3];
        for(int i=0;i<=3;i++)
        {
            arr[i]=new studentcon(101,"Barsha");
            arr[i].show();
        }
    }
}