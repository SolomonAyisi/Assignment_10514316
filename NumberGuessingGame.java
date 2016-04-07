import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[]args)
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int pick = 1 + rand.nextInt(10);
        
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.print("Your guess: " );
        pick = input.nextInt();
        
        if(pick == 1)
                System.out.println("Sorry, but my number is 3");
        else if(pick == 2)
            
                  System.out.println("That's right! My secret number was 2!");
        else if(pick  == 3)
                    System.out.println("Sorry, but I was really thinking of 4");
        
        else if(pick == 4)
                  System.out.println("Sorry, but I was really thinking of 7!");
        
        else if(pick  == 5)
                    System.out.println("Oooh noo, that's not the number. It is 10!");
        
        else if(pick == 6)
                  System.out.println("Sorry,  please guess again since my number was 3!");
        
        else if(pick  == 7)
                    System.out.println("Oooh i'm soory, but the number is 5");
        
        
        else if(pick == 8)
                  System.out.println("That's wrong! My secret number was 9!");
        
        else if(pick  == 9)
                    System.out.println("Oh my God, you are wrong but my number is 8!");
        
        else if(pick  == 10)
                    System.out.println("Sorry , my number is 1!");
        
        else
            System.out.println("MY NUMBER GUESSING GAME : ERROR!");
    }
}
