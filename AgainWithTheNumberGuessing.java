import java.util.Scanner;
public class AgainWithTheNumberGuessing {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int guess = 6;
        int tries = 0;
        
        System.out.println("I have chosen a number betweem 1 to 10. Try to guess it.");
        System.out.print("Your guess: " );
        int entry = input.nextInt();
        tries ++;
        
        do
        {
        System.out.println("That's incorrect. Guess again.");
        System.out.print("Your guess: " );
        entry = input.nextInt(); 
        tries++;
       
        if(entry == guess && tries <= 4)
            System.out.println("That's right!  You're a good guesser.\nIt only took you " + tries + " tries ");
        else 
            System.out.println("Your guessing time is up.");
        
        
        }
        
        while(entry != guess && tries < 4);      
    }
}
