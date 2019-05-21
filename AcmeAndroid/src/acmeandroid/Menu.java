/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeandroid;

import java.util.Scanner;

/**
 *
 * @author Jhoms Mosquera
 * @author Eduardo Nakashima
 * @author Balazs Barcza
 * @author Javier Lopez Santacruz Serraller
 * @author Michał Świtała
 * 
 */
public class Menu {

    private int menuNumber = 0;


//    public Menu() {
//    }
//    public Menu(Setup s1) {
//        this.s1 = s1;
//    }
    
    public void runMenu() 
    {
         System.out.println(" ");
    
     do{
        do 
        {
            System.out.println(" ");
            System.out.println("*****Welcome to ACME Android***** ");
            System.out.println(" ");
            System.out.println((char)27 + "[35m Please choose the search (1-2-3-4) method: ");
            System.out.printf(" 1-Stand up%n 2- Walk%n");
            System.out.printf(" 3- Sit Down%n 4- EXIT%n");
            Scanner scan = new Scanner(System.in);
            
            if (scan.hasNext()) 
            {
                menuNumber = scan.nextInt();
            }

        } while ((menuNumber != 1) && (menuNumber != 2) && (menuNumber != 3) && (menuNumber != 4) && (menuNumber != 5));
     
        switch (menuNumber) {
            case 1:
                 System.out.println(" case 1 ");
                break;
            case 2:
                 System.out.println(" walk ");
                break;
            case 3:
                 System.out.println(" sit down ");
            break;
            case 4:
                 System.out.println(" Exit");
               
                 System.exit(0);
                break;
        }
     } while (menuNumber != 4);
    
    }
}

   
    

