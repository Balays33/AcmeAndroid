/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acmeandroid;
/**
 *
 * @author Jhoms Mosquera
 * @author Eduardo Nakashima
 * @author Balazs Barcza
 * @author Javier Lopez Santacruz Serraller
 * @author Michał Świtała
 * 
 */
public class Printer 
{
    
    
    String [] motorNames;
    
    public void printOutData(MotorJoint passObject){
        passObject.toString();
    }
    
    public void welcome(){
        
        System.out.println("Welcome in AcmeAndroid");
        System.out.println(" ");
        System.out.println("Make an Android stand, walk and sit down with human-like movement.\n"
                + "\n"
                + "Acme Robotics have developed an Android, in collaboration with their partners AndroidsRus, "
                + "they have sourced the motors to be used to articulate the android, along with a "
                + "cheap power plant.\n"
                + "You have been tasked with designing and testing the algorithms to be used in the project.");
                   
    }
    /**
     * 
     * @param motorIndex the index of the motorJoint
     * @param moveType 0 = rotates, 1 = flextionate
     * @param current current position of the motorJoint
     * @param finalPositon final position of the motorJoint
     * @param energyConsumed energy that has been consumed during movement
     */
    
    public void printMove(int motorIndex, int moveType, double current, double finalPositon, double energyConsumed) {

        String mt = " rotates ";
        if (moveType == 1) {
            mt = " flextionate ";
        }

        System.out.println("The motor " + motorNames[motorIndex] + mt + "from " + current + " to " + finalPositon + " degress consuming " + energyConsumed);

    }
    
    
    
    
    
    
    
    
    
    
    
    

}
