import java.util.Scanner;
public class HiLoLimited {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int guess = 84;
        int tries = 0;
        int limit = 7;
        
        System.out.println("I'm thinking of a number betweem 1 to 100. You have seven guesses.");
        System.out.print("First guess: " );
        int entrynum = input.nextInt();
        tries++;
        
        while( entrynum < guess && tries < limit)
        {
            System.out.println("Sorry, you are too low");
            System.out.print("Next guess: " );
            entrynum = input.nextInt();
            tries++;
            while( entrynum > guess && tries < limit)
            {
                System.out.println("Sorry, that guess is too high");
                System.out.print("Next guess: " );
                entrynum = input.nextInt();
                tries++;
            }
        }
        if(entrynum == guess && tries < limit)
            System.out.println("You guessed it!  What are the odds?!?");
        else if(entrynum != guess && tries == limit)
            System.out.println("Sorry, you didn't guess it in 7 tries.  You lose");
        else
            System.out.println("   ");
    }
}
