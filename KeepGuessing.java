import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {
    public static void main(String[]args)
    {
        Random rand = new Random();
        
        Scanner input = new Scanner(System.in);
       
        int num = 6;
        
        System.out.println("I have chosen a number between 1 to 10. Try to guess it.");
        System.out.print("Your guess: " );
        int choice = input.nextInt();
        
        while(choice != num)
        {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            choice = input.nextInt();
        }
        
        System.out.println("That's right! You're a good guesser.");
        
    }
}
