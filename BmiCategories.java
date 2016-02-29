/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class BmiCategories {
    

    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height,weight,BMI,inches,pounds,feet,feetCon;
        BMI = 0;
        System.out.print("Your height in m: ");
        height = in.nextDouble();
        
         System.out.print("Your weight in kg: ");
        weight = in.nextDouble();
        
        
        
        if(BMI < 18.5)
        {
           
            System.out.println("Your BMI is " + BMI );
             System.out.println("BMI Category : Underweight");
        }
        BMI = weight / (height * height);
         System.out.println();
         
          System.out.print("Your height in inches: ");
        inches = in.nextDouble();
        
         System.out.print("Your height in pounds: ");
        pounds = in.nextDouble();
        
       
        if(BMI > 18.5 && BMI < 24.9)
        {
            
            System.out.println("Your BMI is " + BMI);
            System.out.println("BMI Category: Normal weight");
        }
          BMI = (pounds / (inches * inches ))*703;
         
          System.out.print("Your height(feet): ");
        feet = in.nextDouble();
        
         System.out.print("Your height inches : ");
        inches = in.nextDouble();
        
         System.out.print("Your weight pounds: ");
        pounds = in.nextDouble();
        
        feetCon = feet * 12;
        inches = inches + feetCon;
        
        
        if (BMI>= 25 && BMI <= 29.9)
        {
             System.out.println("BMI is  " + BMI);
            System.out.println("BMI CAtegory: Overweight");
        
        }
        else if (BMI >= 30)
         {
             System.out.print("Obese");
         }
        BMI = (pounds / (inches * inches ))*703;
        
        
        
        
        
        
        
      
        
        
        
    }
    
}

    

