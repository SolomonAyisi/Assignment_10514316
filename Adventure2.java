import java.util.*;
public class Adventure2 {
    public static void main(String[]args)
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("MITCHEL'S TINY ADVENTURE 2!");
        
	int nextroom = 1;
        String choice = " ";

        while ( nextroom != 0 )
        {
	 if ( nextroom == 1 )
	 {
	    System.out.println( "You're in a creepy house! Would you like to go \"upstairs\" or into the  \"kitchen\"." );
	    System.out.print( "> " );
	    choice = input.nextLine();
	   if (choice.equals("upstairs")) 
               nextroom = 2;
               else if (choice.equals("kitchen"))
                 nextroom = 3;  
               else
                   System.out.println(choice + " wasn't one of the options. Try again."); 
           //break;
        }    
        
        if(nextroom == 2)
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master");
            System.out.println("\"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can");
            System.out.println("go back \"downstairs\". Where would you like to go?");
            System.out.print( "> " );
            choice = input.nextLine();	    
          if ( choice.equals("bathroom") )
		nextroom = 4 ;
	  else if ( choice.equals("downstairs") )
		nextroom = 3;
	  else
	     System.out.println( choice + " wasn't one of the options. Try again." );
        }
        
        if(nextroom == 3)
	{
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. \nYou may open the \"refrigerator\"\n" + "or go \"back\"." );
           // System.out.println("");
            System.out.print( "> " );
	    choice = input.nextLine();
            if(choice.equals("back"))
                nextroom = 2;
            else if(choice.equals("refrigerator"))
                nextroom = 5;
            else
	     System.out.println( choice + " wasn't one of the options. Try again." );
          
        }
     
        
         if (nextroom == 4)
        {
            System.out.println("There is towel and soap dish in the bathroom. You can go bacck if you want.");
              System.out.print( "> " );
	    choice = input.nextLine();
            if (choice.equals("back"))
                nextroom = 3;
            else
                System.out.println( choice + " wasn't one of the options. Try again." ); 
            
        }
         
         if(nextroom == 5)
         {
            System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
            System.out.print( "> " );
	    choice = input.nextLine();
                 if(choice.equals("yes"))
                     nextroom = 6;
                 else
                System.out.println( choice + " wasn't one of the options. Try again." ); 
         }
         
         if(nextroom == 6)
         { 
          System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach");
          System.out.println("starts jumping like a frog in hot water.  You feel faint. Sliding to the");
          System.out.println("floor, the darkness closes in.\n");
          System.out.println("You have died");
         } 
             
        }  
       
    }
}
       
    

