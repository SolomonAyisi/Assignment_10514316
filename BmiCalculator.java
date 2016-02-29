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
public class BmiCalculator {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height,weight,BMI,inches,pounds,feet,feetCon;
        
        System.out.println("Your height in m: ");
        height = in.nextDouble();
        
         System.out.println("Your weight in kg: ");
        weight = in.nextDouble();
        
        BMI = weight / (height * height);
        System.out.print("Your BMI is " + BMI );
         System.out.println();
         
          System.out.println("Your height in inches: ");
        inches = in.nextDouble();
        
         System.out.println("Your height in pounds: ");
        pounds = in.nextDouble();
        
        BMI = (pounds / (inches * inches ))*703;
         System.out.println("Your BMI is " + BMI);
         
          System.out.println("Your height(feet): ");
        feet = in.nextDouble();
        
         System.out.println("Your height inches : ");
        inches = in.nextDouble();
        
         System.out.println("Your weight pounds: ");
        pounds = in.nextDouble();
        
        feetCon = feet * 12;
        inches = inches + feetCon;
        
        BMI = (pounds / (inches * inches ))*703;
         System.out.println("BMI is  " + BMI);
        
        
        
        
        
        
        
        
      
        
        
        
    }
    
}
