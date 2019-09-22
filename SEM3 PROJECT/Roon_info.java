import java.util.*;
public class Roon_info 
{
     public static void information()
    {
        int room;
        char wish;
     
        Scanner info = new Scanner(System.in); 
        System.out.println("Choose room type :\n" +
                           "1. Single Bed Room \n" +
                           "2. Double Bed Room \n");
        System.out.println("select Room");
        room = info.nextInt();
        switch (room) 
        {
            case 1:System.out.println("Number of bed : 1\nAC : No\nFree food : Yes\nCharge per day:5000 ");
                break;
            case 2:System.out.println("Number of beds : 2\nAC : Yes\nFree food : Yes\nCharge per day:8000  ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        
    }   
           
}
