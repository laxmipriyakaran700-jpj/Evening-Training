class outside
{
    private String uid;
    private String pwd;
    void input(String u,String p)
    {
        uid=u;
        pwd=p;
    }
    void display()
    {
        System.out.println("uid:"+uid);
        System.out.println("pwd:"+pwd);
    }
}
public class user
{
    private 
    String uid;
    private 
    String pwd;
    void input(String u,String p)
    {
        uid=u;
        pwd=p;
    }
    void display()
    {
        System.out.println("uid:"+uid);
        System.out.println("pwd:"+pwd);
    }
    public static void main(String[] args) {
        user obj=new user();
        obj.input("laxmipriya", "mypassward");
        obj.display();
    }
}