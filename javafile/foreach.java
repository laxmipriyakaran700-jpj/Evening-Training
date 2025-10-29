import java.util.ArrayList;
public class foreach
{
    public static void main(String[] args) 
    {
        ArrayList<String>arr3=new ArrayList<String>(4);
        arr3.add("barsha");
        arr3.add("usha");
        arr3.add("puja");
        arr3.add("sibani");
        for(String a:arr3)
        {
            System.out.println(a);
        }
    }
}