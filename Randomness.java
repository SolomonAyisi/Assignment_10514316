import java.util.Random;
public class Randomness {
    public static void main(String[]args)
    {
        Random r = new Random();
        /*When i passed 12353 into the random number generator, 
        it gives the random number as 4 and a range from 4 - 7*/
        int x = 1 + r.nextInt(10);
        
        System.out.println("My random number is " + x);
        
        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.println();
        //When i changed the value to 3, it picked random numbers from 4 to 7
        
        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();
        
        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);
        
        if(num1 == num2)
        {
            System.out.println("The random numbers were the same! weird");
        }
        
        if(num1 != num2)
        {
            System.out.println("The random numbers were different! Not too surprising, actually");
        }
    }
    
}
    

