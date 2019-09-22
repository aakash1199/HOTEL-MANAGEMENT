import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class cheakout 
{
    public static void out() {
        int room;
        Scanner cr=new Scanner(System.in);
        System.out.println("Room no:");
        room=cr.nextInt();
        File obj = new File(room+".txt");
        if (obj.exists())         
        {           
            try
            {
                try 
                    (
                        Scanner myReader = new Scanner(obj))
                {                  
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                        if(room>=1 && room<=10)
                        {
                            System.out.println("Room Bill:5000");                                                 
                        }
                        else
                        {
                            System.out.println("Room Bill:8000");                                               
                        }
                    }  
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("An error occurred.");
            }
            System.out.println("Good Bye");
            obj.delete();        
        }     
        else
        {
            System.out.println("empty room");
        }
    }
}