import java.io.FileWriter;   
import java.io.IOException;  
import java.util.Scanner;
public class Doublebed 
{
   public static void db() 
   {
       Scanner obj=new Scanner(System.in);

       int filename,contact,contact2;  
       
       String Name;
       String Name2;
       String Gender; 
       String Gender2;
       
       System.out.println("FIRST PERSON NAME"); 
       Name = obj.nextLine();
       
       System.out.println("SECOND PERSON NAME"); 
       Name2 = obj.nextLine();
       
       System.out.println("FIRST PERSON GENDER"); 
       Gender= obj.nextLine();
       
       System.out.println("SECOND PERSON GENDER"); 
       Gender2= obj.nextLine();
       
       System.out.println("FIRST PERSON CONTACT NO");
       contact=obj.nextInt();
              
       System.out.println("SECOND PERSON CONTACT NO");
       contact2=obj.nextInt();
       
       System.out.println("11,12,13,14,15,16,17,18,19,20");                                                 
       System.out.println("ROON NO:"); 
       filename=obj.nextInt();
           
       try
       {
           try (FileWriter output = new FileWriter(filename+".txt"))
           {
               output.write("FIRST PERSON NAME:"+Name+"  ");
               output.write("FIRST PERSON CONTACT:"+contact+"  ");
               output.write("FIRST PERSON GENDER:"+Gender+"  ");
               output.write("SECOND PERSON NAME:"+Name2+"  ");
               output.write("SECOND PERSON CONTACT:"+contact2+"  ");
               output.write("SECOND PERSON GENDER:"+Gender2+"  ");
               output.close();
           }          
      System.out.println("Successfully Double Bed Booked.");
      System.out.println("Thank you for Booking");
    }
       catch (IOException e)
       {
      System.out.println("Booking Fail.");
       }
  }
}