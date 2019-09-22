import java.io.FileWriter;   
import java.io.IOException;  
import java.util.Scanner;
public class Singlebed 
{
    public static void sb()
    {
       Scanner obj=new Scanner(System.in);

       int filename,contact;  
       
       String Name;
       String Gender;       
       
       System.out.println("NAME"); 
       Name = obj.nextLine();
       
       System.out.println("GENDER"); 
       Gender= obj.nextLine();
     
       System.out.println("CONTACT NO");
       contact=obj.nextInt();
       
       System.out.println("1,2,3,4,5,6,7,8,9,10");
       System.out.println("ROOM NO:"); 
       filename=obj.nextInt();

       try       
       {
           try (FileWriter output = new FileWriter(filename+".txt"))
           {
               output.write("Name:"+Name+"  ");
               output.write("Contact:"+contact+"  ");
               output.write("Gender:"+Gender+"  ");
               output.close();
          }          
      System.out.println("Successfully Single Bed Booked.");
      System.out.println("Thank you for Booking");
    }
       catch (IOException e)
    {
      System.out.println("Booking Fail.");
      
    }
  }
}