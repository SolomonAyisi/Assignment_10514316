import java.util.Scanner;
public class EnterPIN {
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME To THE BANK OF MICHELL.");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while(entry != pin)
        {        
        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
        System.out.println("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();  
        }
        
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        
        /* 1. A while loop is similar to an if statement in a sense that
        it test a condition before executing the statements in it's block. */
        
        /* 2. A while loop is different from an if statement in a sense that
        the while loop loops through the statements in the block a number 
        of times until it's condition is met while the if 
        statement only test it's condition and if it is true, it executes
        the statements in it's block.*/
        
        /* 3. There isn't an int in front of entry because the variable 
        entry is already declared and the it's data type is no longer
        needed in the while loop*/
        
        /* 4.When entry = keyboard.nextInt() is deleted, the loop runs
        infinitely, that is it runs through the loop without stopping 
        and this is because there is no statement to pause the program
        for an entry since everything in the block is a statement. 
        And since it's condition has not yet been met, it will continue to run forever.*/
    }
}
