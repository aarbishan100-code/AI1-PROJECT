package workshopp;
import java.util.Scanner;

public class today
{
    public static void main (String [] arg)
    {
        int marks;
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter your total marks");
        marks =sc.nextInt();
        String a = (marks>40) ? "PASS!!!":"FAIL HAHA!!!";
        System.out.println (a);
        
        
        
        
    }
}