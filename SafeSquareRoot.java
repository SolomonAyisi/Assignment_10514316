import java.util.Scanner;
public class SafeSquareRoot {
    public static void main(String[]args)
    {
    Scanner keyboard = new Scanner(System.in);
    double num;
    int count = 1;
    
    System.out.println("SQUARE ROOT!");
    
    System.out.print("Enter a number: ");
    num = keyboard.nextDouble();
  
    System.out.println("The square root of " + " " + num + " is " + Math.sqrt(num));
    
    while(count < 5 )
    {
    System.out.print("Enter a number: ");
    num = keyboard.nextDouble();
    System.out.println("The square root of " + " " + num + " is " + Math.sqrt(num));
    count++;
    
    if(num < 0)
        System.out.println("You can't take the square root of a negative number, silly.");
    
    	System.out.print("Try again: ");
    	num = keyboard.nextDouble();
    	System.out.println("The square root of " + " " + num + " is " + Math.sqrt(num));
    	count++;   
         
        }
    }
}
