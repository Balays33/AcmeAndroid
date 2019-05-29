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

    
   // Fields of data
       
    private Data d = new Data();
    private String[] motorNames;
    private MotorJoint[] mj;
    
    
     public Printer(MotorJoint[] mj)
    {
        this.mj = mj;
        this.motorNames = d.getMotorName();
    }
    
    public void setMotorNames() {

        this.motorNames = d.getMotorName();
    }
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

    /**
     *
     * @param motorIndex the index of the motorJoint to be selected
     * @param current the current position (degree) of the current motorJoint
     * @param batteryEnergy the current energy of the battery
     */
    public void standingPosition(int motorIndex, double current, double batteryEnergy) {

        System.out.println(" ");
        System.out.println("The Android is currently standing.");
        System.out.println(" ");
        System.out.println("The motor " + motorNames[motorIndex] + " is currently at: " + current + " degrees.");
        System.out.println("The battery has " + batteryEnergy + " energy left.");

    }

    /**
     *
     * @param motorIndex the index of the motorJoint
     * @param moveType 0 = rotates, 1 = flextionate
     * @param current current position of the motorJoint
     * @param finalPositon final position of the motorJoint
     * @param energyConsumed energy that has been consumed during movement
     *
     */
    public void printMove(int motorIndex, int moveType, double current, double finalPositon, double energyConsumed) {

        String mt = " rotates ";
        if (moveType == 1) {
            mt = " flextionate ";
        }

        //System.out.println(" ");
        System.out.println("The Android is currently moving.");
        System.out.println(" ");
        System.out.println("Motor " + motorNames[motorIndex] + mt + "from " + current + " to " + finalPositon + " degrees.");
        System.out.println("The battery has been consumed by " + energyConsumed + " Volts. ");

    }

    // added new print by balazs
                                                                                                                                         
    
    public void printbatteryRequireRotation(int motorIndex, double sixtydegree,double jointmove,double energyConsumption, double batteryCurrentLevel, double endpoint){
        // print out  if movement is more than 60% of available motion for a motor
        System.out.println("Information about the motor: ");
        System.out.println("Motor name: "+ motorNames[motorIndex]+ " Maximum Rotation: " +mj[motorIndex].getMaximumRotation()+ " Move requires: " + energyConsumption*1000+ " mV  Current Rotation: " +mj[motorIndex].getCurrentRotation()+ 
                            " moving position: " + endpoint+ " Battery Current Level: "+ batteryCurrentLevel+ " Volts");
        System.out.println("-------------------------------");
    }
    
     public void printbatteryRequireFlexion(int motorIndex, double sixtydegree,double jointmove,double energyConsumption, double batteryCurrentLevel, double endpoint){
        // print out  if movement is more than 60% of available motion for a motor
        System.out.println("Information about the motor: ");
        System.out.println("Motor name: "+ motorNames[motorIndex]+ " Maximum Flexion: " +mj[motorIndex].getMaximumFlexion()+ " Move requires: " + energyConsumption*1000+ " mV   Current Flexion: " +mj[motorIndex].getCurrentFlexion()+ 
                            " moving position: " + endpoint+ " Battery Current Level: "+ batteryCurrentLevel+ " Volts");
        System.out.println("-------------------------------");
    }
    
    public void printMovmentTake(long sleepingMiliSecondsMovement){
        System.out.println((char)27 + "[35m Motor moving time : " +sleepingMiliSecondsMovement + " milliseconds");
    }
    
    public void printEnergyConsumption(double energyConsumption){
        System.out.println("EnergyConsumption level: " + energyConsumption);
    }
    
    public void printBatteryLevel(double batteryCurrentLevel){
        System.out.println("Battery NEW level : " + batteryCurrentLevel);
    }
    
    public void printbatteryRecharge(double batteryCurrentLevel,double energyConsumption, long sleepingMiliSeconds){
        // battery recharge method
        System.out.println("Battery Recharge method: ");
        System.out.println((char)27 + "[35m Battery is charging time : " +sleepingMiliSeconds + " milliseconds");
        System.out.println("Battery level after the charge : " + batteryCurrentLevel+" Volts   Move requires: " + energyConsumption*1000+ " mV");
        System.out.println("-------------------------------");
    }
    

    
}

