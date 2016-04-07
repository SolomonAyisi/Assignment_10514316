import  java.util.Scanner;
public class AddingValuesInALoop {
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        int count = 1;
        int numba;
        
        System.out.println("I will add uo the numbers you will give me");
        System.out.print("Number:");
        numba = keyboard.nextInt();
   
        result += numba;
        System.out.println("The total so far is " + result);
        
        while(numba != 0)
        {
            
            System.out.print("Number:");
            numba = keyboard.nextInt();
            result += numba;
            count++;
            
            System.out.println("The total so far is " + result);
        }
         System.out.println("\nThe total is " + result);
}
}