class customer
{
    private
    String cust_nm="Mani";
    public
    int cust_id=1;
    public
    void show()
    {
        System.out.println(cust_nm);
        System.out.println(cust_id);
    }
}
public class mycust
{
    public static void main(String[] args) {
        customer obj=new customer();
        obj.show();
    }
}