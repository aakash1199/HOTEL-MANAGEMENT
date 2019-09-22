import java.util.*;
public class food 
{
    public static void ofood()
    {
        Scanner f = new Scanner(System.in);
        int item,quantity,price = 0;
        System.out.println("order food");
        System.out.println("1.Sandwich");
        System.out.println("2.Pasta");
        System.out.println("3.Noodles");
        System.out.println("4.Coke");
        System.out.println("select item");
        item = f.nextInt();
        System.out.println("quantity");
        quantity = f.nextInt();
        switch(item)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
        
        System.out.println(price+"$");
    }
    
}
