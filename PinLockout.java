import java.util.Scanner;
public class PinLockout {
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxnum = 4;
        
         System.out.println("\nWELCOME TO THE BANK OF MICHELL.");
         System.out.print("ENTER YOUR PIN: ");
         int entry = keyboard.nextInt();
         tries++;
        
        while( entry != pin && tries < maxnum)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }
        
        if( entry == pin)
           System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if( tries >= maxnum )
            System.out.println("\nMAXIMUM NUMBER OF TRIES REAACHED. ACCOUNT LOCKED, PLEASE CONTACT YOUR BANK FOR FURTHER DETAILS.");
        
    }   
}
