public class checkleapyear
{
    public static void main(String[] args) {
        int year=2025;
        if((year%400==0)||(year%4==0 && 100!=0))
        {
            System.out.println("Leapyear");
        }
        else
        {
            System.out.println("not a Leapyear");
        }
    }
}