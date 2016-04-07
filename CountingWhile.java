import java.util.Scanner;
public class CountingWhile {
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println( "Type in a message, and I'll display it five times.");
        System.out.print( "Message: ");
        String message = keyboard.nextLine();
        
        System.out.println("How many times?(1 to 10)");
        int num = keyboard.nextInt();
        
        if(num == 1)
        {
        int n = 0;
        while( n < 10)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 2)
        {
            int n = 0;
        while( n < 20)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 3)
        {
             int n = 0;
        while( n < 30)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 4)
        {
        int n = 0;
        while( n < 40)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 5)
        {
            int n = 0;
        while( n < 50)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 6)
        {
             int n = 0;
        while( n < 60)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
         else if(num == 7)
        {
             int n = 0;
        while( n < 70)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 8)
        {
        int n = 0;
        while( n < 80)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 9)
        {
            int n = 0;
        while( n < 90)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else if(num == 10)
        {
             int n = 0;
        while( n < 100)
        {
            System.out.println( (n+10) + ". " + message);
            n+=10;
        }
        }
        
        else
        {
            System.out.println("    ");
        }
        /*n++ in the while loop increments the counter(n) by 
        1 whenever something happens and without it the loop runs without exiting*/
    }
}
