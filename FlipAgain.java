import java.util.Random;
import java.util.Scanner;
public class FlipAgain {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String again;
                
                 do{
                        int flip = rand.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			 
                        again = keyboard.next();
                        }
                 
                        while ( again.equals("y") );
      }

   }
/*The program works for the do-while loop because,
the do-while loop executes all statements in its 
block before testing the condition in the while loop. 
This shows how efficient do-while loop is as compared to while loop.*/


