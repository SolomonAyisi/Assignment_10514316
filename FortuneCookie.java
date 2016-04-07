import java.util.Random;
public class FortuneCookie {
    public static void main(String[] args)
    {
    Random rand = new Random();
    
    int type = 1 + rand.nextInt(6);
    String answer = " ";
    
    int lotto = 1 + rand.nextInt(54);
    String num = " "; 
    
    if(type == 1)
      answer =  " You will not find hapiness with a new love.";
    else if (type == 2)
        answer = " You will find hapiness with a new love.";
    else if (type == 3)
        answer = " You will find hapiness with a new love.";
    else if(type == 4)
      answer = " You will find hapiness with a new love.";
    else if (type == 5) 
        answer = " You wil find hapiness with a new love.";
    else if (type == 6)
        answer = " You will not find hapiness with a new love.";
    else
        answer = "FORTUNE COOKIE: ERROR! ";
    
    System.out.println("Fortune Cookie says:" + answer + "\n");
    
    
    if(lotto == 1)
      num =  "Stick with your wife.\n \t13 - 44 - 19 - 37 - 29 - 17";
    else if (type == 2)
      num = "Stick with your wife.\n \t10 - 40 - 21 - 30 - 15 - 9";
    else if (type == 3)
      num ="Stick with your wife.\n \t26 - 34 - 50 - 24 - 6 - 34";
    else if(type == 4)
      num ="Stick with your wife.\n \t5 - 16 - 22 - 52 - 39 - 23";
    else if (type == 5)
      num ="Stick with your wife.\n \t16 - 42 - 7 - 38 - 31 - 46";
    else if (type == 6)
      num = "Stick with your wife.\n \t33 - 22 - 49 - 36 - 18 - 11";
    else
      num = "FORTUNE COOKIE: ERROR! ";
    
    System.out.println("Fortune Cookie says: " + num);
 }
}