import java.util.Scanner;

public class hello
{
    public static void main(String [] args)
    {
        float a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("sum =" + ( a + b));
        System.out.println("product=" + ( a * b));
        System.out.println("difference =" + ( a - b));
        System.out.println("division =" + ( a /b));
        System.out.println("remainder=" + ( a % b));
        
    }
}