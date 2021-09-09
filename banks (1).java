import java.util.*;
class customer
{
    String name,bank;
    int accno,amount;
    customer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        name = sc.next();
        System.out.println("Enter Bank:");
        bank = sc.next();
        System.out.println("Accno:");
        accno = sc.nextInt();
        System.out.println("Enter Amount:");
        amount = sc.nextInt();
    }
}
class Investment
{
    static void intrest(customer c)
    {
        switch (c.bank)
        {
            case "federal":System.out.println("Intrest at federal:"+(c.amount*(8.4f/100f)));
                break;
            case "Karur":System.out.println("Intrest at Karur:"+(c.amount*(7.3f/100f)));
                break;
            case "BOI":System.out.println("Intrest at BOI:"+(c.amount*(9.7f/100f)));
                break;
            default:System.exit(0);
                break;
        }
    }
}
public class banks
{
    public static void main(String args[]){
        customer c = new customer();
        Investment.intrest(c);
    }
}