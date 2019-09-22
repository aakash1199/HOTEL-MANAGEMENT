import java.util.*;
public class Book 
{
    public static void booking()
    {
        Singlebed single = new Singlebed();
        Doublebed doubl = new Doublebed();
        int j,rn;  
        Scanner info = new Scanner(System.in); 
        System.out.println("Choose room type :\n" +
                           "1. Single Bed Room \n" +
                           "2. Double Bed Room \n");
                           
        System.out.println("Choose room type :");
        rn = info.nextInt(); 
        System.out.println("Choose room number: ");
        switch(rn)
        {
            case 1:Singlebed.sb();
                break;
            case 2:Doublebed.db();
                break;
            default:
             System.out.println("Enter valid option");
                 break;
        }      
        
    }
}
            
    