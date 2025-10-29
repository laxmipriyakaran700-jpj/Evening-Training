import java.util.*;
public class Arithmatic
{
    public static void main(String[] args)
     {
        int a,b,d,k,r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        d=sc.nextInt();
        k=sc.nextInt();
        r=sc.nextInt();
        int c=a+b-d;
        int m=c*(k+r-d);
        int res=(a+b/2)*(a-b/2);
        int e=(a+b)*(a+b);
        System.out.println("c="+c);
        System.out.println("m="+m);
        System.out.println("res="+res);
        System.out.println("e="+e);
    }
}