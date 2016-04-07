import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonte {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int enter = 1 + rand.nextInt(3);
        String yes =" "; 
        
        System.out.println("You slide up to fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.\n");
        
        System.out.println("Which one is the ace?");
        
        System.out.println("\t##\t##\t##");
        System.out.println("\t##\t##\t##");
        System.out.println("\t1 \t2 \t3\n");
        enter = input.nextInt();
        
        if(enter == 1)
        {
            yes = "Haha! Fast Eddie wins again! The ace was card number 3.\n \t##\t##\tAA\n \t##\t##\tAA\n \t1 \t2 \t3";
        }
        else if(enter == 2)
        {
            yes = "You nailed it! Fast Eddie reluctantly hands over your winnigs, scowlin.\n \t##\tAA\t##\n \t##\tAA\t##\n \t1 \t2 \t3"; 
        }
        else if(enter == 3 )
        {
          yes = "Ha! Fast Eddie wins again! The ace was card number 1.\n \tAA\t##\t##\n \tAA\t##\t##\n \t1 \t2 \t3";
        }
        else
        {
           System.out.println(" ");
        }
        System.out.println(yes);
        
    }
}
