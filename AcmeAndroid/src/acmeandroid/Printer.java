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
public class Printer {

    
 
    /**
     * @param passObject MotorJoint object needs to be passed inside
     */
    public void printOutData(MotorJoint passObject) {

        passObject.toString();
    }

    /**
     * Prints out welcome message to the user.
     */
    public void welcome() {

        System.out.println("Welcome in AcmeAndroid.");
        System.out.println(" ");
        System.out.println("Acme Robotics have developed an Android, in collaboration with their partners AndroidsRus.");
        System.out.println("They have sourced the motors to be used to articulate the android, along with a cheap power plant.");
        System.out.println("This application will allow you to choose and make an Android stand, walk and sit down with human-like movement.");
        System.out.println("You will also be able to see the progress of each pose transitions.");
        System.out.println(" ");

    }

    /**
     *
     * @param motorIndex the index of the motorJoint to be selected
     * @param current the current position (degree) of the current motorJoint
     * @param batteryEnergy the current energy of the battery
     */
    public void sittingPosition(int motorIndex, double current, double batteryEnergy) {

        System.out.println(" ");
        System.out.println("The Android is currently sitting on the chair.");
        System.out.println(" ");
        
        System.out.println("The motor " + motorNames[motorIndex] + " is currently at: " + current + " degrees.");
        
        System.out.println("The battery has " + batteryEnergy + " energy left.");
        
        
    }

    /*
    public void currentPosition(int motorIndex,double curren,int moveType)
    {
        String move="";

        System.out.println("The " + motorNames[motorIndex] + " motor "+move+" is  at: " + current + " degrees.");
        
        
    }

*/
    
    /**
     *
     * @param dataStand pass DataStand class over here to access data field
     * @param data pass Data class over here to access data field
     * 
     */
    public void standingPosition(DataStand dataStand, Data data) {
        
        System.out.println(" ");
        System.out.println("The Android is currently standing.");
        System.out.println(" ");

        // Loop through motorNames array  which is passed by Data object overhere
        for (int index = 0; index < data.getMotorName().length; index++) {
            
            System.out.println("The motor " + data.getMotorNameAt(index) + "  has  flextion at: " + dataStand.getFlextionAt(index) + " degrees and rotation at: " + dataStand.getRotationAt(index) + " degrees. ");
            
        }
        
    }

    /**
     *@param data the Data class object required to access MotorNames array
     * @param motorIndex the index of the motorJoint
     * @param moveType 0 = rotates, 1 = flextionate
     * @param current current position of the motorJoint
     * @param finalPositon final position of the motorJoint
     * @param energyConsumed energy that has been consumed during movement
     */
    public void printMove(Data data, int motorIndex, int moveType, double current, double finalPositon, double energyConsumed) {

        String mt = " rotates ";
        if (moveType == 1) {
            mt = " flextionate ";
        }

        System.out.println(" ");
        System.out.println("The Android is currently moving.");
        System.out.println(" ");
        System.out.println("The motor " + data.getMotorNameAt(motorIndex) + mt + "from " + current + " to " + finalPositon + " degrees.");
        System.out.println("The battery has been consumed by " + energyConsumed + " Volts. ");

    }


    
}
