public class course
{
    String cor_nm="B.tech";
    void show()
    {
        System.out.println("course:"+cor_nm);
    }
    public static void main(String[] args)
    {
        course obj[]=new course[5];
        for(int i=0;i<5;i++)
        {
            obj[i]=new course();
            obj[i].show();
        }
    }
}