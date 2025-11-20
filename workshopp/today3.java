package workshopp;
import java.util.Scanner;


/**
 * Write a description of class today3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class today3
{
    public static void main (String[] arg)
    {
        int a , b;
        Scanner sc = new Scanner (System.in);
        System.out.println ("ENTER days");
        a=sc.nextInt();
        int y =(a / 365);
        int r = a % 365;
        int m = r / 30;
        int rr = r %30;
        int w = rr / 7;
        int rrr = rr % 7 ;
        int h = rrr * 24; 
        System.out.println ("total year is" +y);
        System.out.println ("total monthsis" +m);
        System.out.println("total week is"+w);
        System.out.println("total days is"+rrr);
        System.out.println("total hours is"+h);
        
        
    }
    
}