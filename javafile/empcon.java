public class empcon
{
    int id;
    String name;
    double salary;
    empcon()
    {
        id=101;
        name="Barsha";
        salary=500000;
    }
    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
        empcon obj=new empcon();
        obj.display();
    }
}