public class access
{
    int x=20;
    private 
    int y=30;
    public 
    int z=40;
    protected 
    int k=37;
    public 
    void show()
    {
        System.out.println("default:"+x);
        System.out.println("private:"+y);
        System.out.println("public:"+z);
        System.out.println("protected:"+k);
    }
    public static void main(String[] args) {
        access obj=new access();
        obj.show();
    }
}