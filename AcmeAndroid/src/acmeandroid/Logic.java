/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeandroid;

import java.util.Scanner;

/**
 *
 * @author MichaelTheProgrammer
 */
public class Logic {
    
     private int menuNumber = 0;


    
    
    //Here we put logic, what programm is doing step by step
    
    public Printer printWelcome(Printer printer) {

        printer.welcome();
            return printer;
    }

    public void setup() {

    }

    public void showMenu() {
        
    System.out.println(" ");
    
     do{
        do 
        {
           
            System.out.println(" ");
            System.out.println((char)27 + "[35m Please choose the search (1-2-3-4) method: ");
            System.out.printf(" 1-Stand up%n 2- Walk%n");
            System.out.printf(" 3- Sit Down%n 4- EXIT%n");
            Scanner scan = new Scanner(System.in);
            

            
            if (scan.hasNext()) 
            {
                getInt();
                
            }

        } while ((menuNumber != 1) && (menuNumber != 2) && (menuNumber != 3) && (menuNumber != 4) && (menuNumber != 5));
     
        switch (menuNumber) {
            case 1:
                 System.out.println("Stand Up");
                 //Set initial position sit
                 //Set final position stand up
                 //Call method
                break;
            case 2:
                 System.out.println(" walk ");
                 //Set initial position stand up
                 //Walk 3 steps
                 //Set final position stand up
                 //Call method
                break;
            case 3:
                 System.out.println(" sit down ");
                  //Set initial position stand up
                 //Set final position sit down
                 //Call method
            break;
            case 4:
                 System.out.println(" Exit");
               
                 System.exit(0);
                break;
        }
     } while (menuNumber != 4);
    
    
         
}


   
        public void getInt()
    {
        try
        {
             System.out.println("Only numbers");
             Scanner scan = new Scanner(System.in);
             menuNumber = scan.nextInt();
             
        }
        catch(Exception e)
        {
            System.out.println("Error, only numbers");
            getInt();
        }
        
    }
    
    
    
    
}


