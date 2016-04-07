import java.util.Scanner;
public class NumberGuessingWithACounter {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int guess = 6;
        int tries = 0;
        
        System.out.println("I have chosen a number betweem 1 to 10. Try to guess it.");
        System.out.print("Your guess: " );
        int entry = input.nextInt();
        tries ++;
        
        while(entry != guess && tries < 4)
        {
        System.out.println("That's incorrect. Guess again.");
        System.out.print("Your guess: " );
        entry = input.nextInt(); 
        tries++;
       }
        
        if(entry == guess && tries <= 4)
            System.out.println("That's right!  You're a good guesser.\nIt only took you " + tries + " tries ");
        else 
            System.out.println("Your guessing time is up.");
            
    }
}
