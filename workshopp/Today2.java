package workshopp;
import java.util.Scanner;


/**
 * Write a description of class Today2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Today2
{
    public static void main (String[] arg)
    {
        int a , b;
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        String c = ( a > b)? a+"IS GREATER" : b+"IS GREATER";
        System.out.println (c);
        
    }

}