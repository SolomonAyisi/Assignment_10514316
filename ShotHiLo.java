import java.util.Scanner;
import java.util.Random;
public class ShotHiLo {
    public static  void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        
        Random r = new Random();
        int pick = 1 + r.nextInt(100);
        String output = " ";
              
        System.out.println("I'm thinking of a number between 1 - 100.  Try to guess it.");
        pick = enter.nextInt();
        
        if(pick == 42)
        {
            output = "You guessed it!  What are the odds?!?";
        }
        else if(pick < 34)
        {
            output = "Sorry you are too low. I was thinking of 34";
        }
        else if(pick > 51)
        {
            output = "Sorry you are too high. I was thinking of 51";
        }
        else
        {
            output = "Out of bound";
        } 
        
        System.out.println("\n" + output);
    }
}
