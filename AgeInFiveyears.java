/*
Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. 
Then display what their age would be five years from now. 
Then display what their age would be five years ago

 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class AgeInFiveyears {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in) ;
       
       String name;
       int age,Age,newAge;
       
       System.out.print("Hello. What is your name? ");
       name = in.next();
       
       System.out.print("Hi, " + name +"!" + "How old are you? ");
       age = in.nextInt();
       
       Age = age + 5;
       newAge = age - 5;
       
       System.out.println("Do you know that in five years you will be " + Age +"yearsold?\n");
       System.out.println("And five years ago you were " + newAge +"yearsold?\n");
    }
            
    
}
