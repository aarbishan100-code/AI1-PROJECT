import java.util.Scanner;

public class hero
{
    public static void main (String [] args)
    {
        int ltr;
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the water level of the tank");
        ltr= sc.nextInt();
        System.out.println("the water levek is " + ltr +"l");
        String a = (ltr>1000) ? "WARNING !!!! THE WATER LEVEK IS ABNORMAL!!!!":"WATER LEVEL STATUS = NORMALL NO NEED TO WORRY";
        System.out.print(a);
        
        
            
        
        
        
    }
}