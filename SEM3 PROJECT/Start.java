import java.util.*;
public class Start extends Book
{   
    public static void main(String args[])
    {
        int i,wish;
        Roon_info info=new Roon_info();
        Book b = new Book();
        food f=new food(); 
        cheakout c=new cheakout();
        do
        {
        Scanner o = new Scanner(System.in);  
        System.out.println("Welcome");
        System.out.println("Enter your choice :\n" +
                "1.Display room details\n" +
                "2.Book\n" +
                "3.Order food\n" +
                "4.Checkout\n" +
                "5.Exit");
        i = o.nextInt();
        switch(i)
        {
            case 1:Roon_info.information();
                break;
            case 2:Book.booking();
                break;
            case 3:food.ofood();
                break;
            case 4:cheakout.out();
                break;
            case 5:System.exit(0); 
                break;
        }                                      
                   System.out.println("\nContinue : (y/n)");
            wish=o.next().charAt(0); 
            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish=o.next().charAt(0); 
            }        
     }
     while(wish=='y'||wish=='Y');
    }
    
    
}
