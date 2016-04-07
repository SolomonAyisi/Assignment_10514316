import java.util.Random;
public class Dice {
    public static void main(String[]args)
    {
        Random rand = new Random();
        
        int type  = 1 + rand.nextInt(6);
        int frnum;
        
        int choice = 1 + rand.nextInt(6);
        int srnum;
        
        int sum;
        
    System.out.println("HERE COMES THE DICE!\n");
        
         
    if(type == 1)
      frnum =  2;
    else if (type == 2)
        frnum = 4;
    else if (type == 3)
        frnum = 1;
    else if(type == 4)
        frnum = 6;
    else if (type == 5)
        frnum = 3;
    else if (type == 6)
        frnum = 5;
    else
        frnum = 0;
    
    System.out.println("Roll #1: " + frnum);
    
    
    if(choice == 1)
      srnum =  2;
    else if (choice == 2)
        srnum = 4;
    else if (choice == 3)
        srnum = 1;
    else if(choice== 4)
        srnum = 6;
    else if (choice == 5)
        srnum = 3;
    else if (choice == 6)
        srnum = 5;
    else
        srnum = 0;
    
    System.out.println("Roll #2: " + srnum);
    sum = frnum + srnum;
            
    System.out.println("The total is " + sum + "!");
    
    }
}
