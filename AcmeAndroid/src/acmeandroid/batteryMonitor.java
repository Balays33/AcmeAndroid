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
public class batteryMonitor {
    
    private double energyConsumption;
    private final int batteryMinLevel = 1;
    private final int batteryMaxLevel = 8;
    private double batteryCurrentLevel;
    private long miliseconds;
    private boolean movementAllow =  false;
    
    MotorJoint[] m;
    /*
        the power plant is a cheap model of lithium battery from AndroidsRus and 
        can only produce 8 volts, its recovery time after discharging is 3 seconds.(2.6 volts per second)
    */

    public batteryMonitor(MotorJoint[] m)  
    {
        this.m = m;
    }
    /*  deadend
    public void batteryCheck(double energyConsumption) throws InterruptedException
    {
        this.energyConsumption = energyConsumption;
        
        // battery check recharge
        if (batteryCurrentLevel == batteryMinLevel){
            miliseconds=0;
            Thread.sleep(miliseconds);
        }
    
    }
    */
    
    public void allowMove() {
        
        

    }

    public void batteryRequire(int index, int movementFlextionOrRotation, double endpoint) {

        switch (movementFlextionOrRotation) {
            case 0:   // Rotation = 0

                if (endpoint > m[index].getMaximumRotation()) {
                    System.out.print("ERROR");
                }
                m[1].getEnergyConsumption();
                m[1].getMaximumRotation();
                double moveCtoEndPoint = endpoint - m[index].getCurrentRotation();

                break;
            case 1:   // flexion = 1 

                break;
            default:
                System.out.print("ERROR");

        }
    }
}
