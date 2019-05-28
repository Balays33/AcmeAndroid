/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeandroid;

import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private int index = 1;
    private double endpoint;
    private int movementFlextionOrRotation;
    private long sleepingMiliSeconds;
    private boolean movementAllow =  true;
    private double movement;
    private double sixtydegree;
    private double jointmove;
    private long sleepingMiliSecondsMovement;
    
    
    
    MotorJoint[] m;
    Printer printer;
    /*
        the power plant is a cheap model of lithium battery from AndroidsRus and 
        can only produce 8 volts, its recovery time after discharging is 3 seconds.(2.6 volts per second)
    */

    public batteryMonitor() {
    }

    
    public batteryMonitor(MotorJoint[] m)  
    {
        this.m = m;
    }
    
    public batteryMonitor(Printer printer )
    {
        this.printer = printer;
    }
    public batteryMonitor(MotorJoint[] mj, Printer printer )
    {
        this.m = mj;
        this.printer = printer;
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
    
    
    
     
    public boolean allowMove(int index, int movementFlextionOrRotation, double endpoint) {
        this.index = index;
        this.movementFlextionOrRotation =movementFlextionOrRotation;
        this.endpoint = endpoint;
            batteryRequire(index,movementFlextionOrRotation,endpoint);
        return movementAllow;    
    }

    private void batteryRequire(int index, int movementFlextionOrRotation, double endpoint) {

        //this.endpoint = endpoint;
        switch (movementFlextionOrRotation) {
            case 0:   // Rotation = 0
               // /*
                if ((endpoint > m[index].getMaximumRotation()) || (endpoint < 0) ) {
                    System.out.println("ERROR endpoint is bigger that max rotation range or smaller that min rotation range");
                    movementAllow = false;
                } else {

                    if (endpoint > m[index].getCurrentRotation()) {
                        sixtydegree = (60 * (m[index].getMaximumRotation() - m[index].getCurrentRotation()) / 100);
                    } else {
                        sixtydegree = (m[index].getCurrentRotation()*0.6);
                    }
                    jointmove = endpoint - m[index].getCurrentRotation();
                    if (Math.abs(endpoint - m[index].getCurrentRotation()) > sixtydegree) {
                        //add extra 3 volt
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                       // printer.printEnergyConsumption(energyConsumption);
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                        //printer.printEnergyConsumption(energyConsumption);
                    }
                }
                printer.printbatteryRequireRotation(index, sixtydegree, jointmove, energyConsumption, batteryCurrentLevel, endpoint);
                break;
            case 1:   // flexion = 1 
                ///*
                if ((endpoint > m[index].getCurrentFlexion()) || (endpoint < 0)) {
                    System.out.print("ERROR endpoint is bigger that max flexion range or smaller that min flexion range");
                    movementAllow = false;
                } else {

                    if (endpoint > m[index].getCurrentFlexion()) {
                        sixtydegree = (60 * (m[index].getMaximumFlexion() - m[index].getCurrentFlexion()) / 100);
                    } else {
                        sixtydegree = (m[index].getCurrentFlexion() *0.6);
                    }
                    jointmove = endpoint - m[index].getCurrentFlexion();
                    if (Math.abs(endpoint - m[index].getCurrentFlexion()) > sixtydegree) {
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                    }
                }
                printer.printbatteryRequireFlexion(index, sixtydegree, jointmove, energyConsumption, batteryCurrentLevel, endpoint);
                //*/
                break;
            default:
                System.out.print("ERROR");

        }
        if (movementAllow){
            batteryRecharge(energyConsumption);
            //movement(batteryCurrentLevel,jointmove,energyConsumption);
            }
        
    }
    
    private void batteryRecharge(double energyConsumption){
        
        sleepingMiliSeconds = (long)(((energyConsumption + batteryMinLevel - batteryCurrentLevel)/8) * 3000);
        
        //printer.printbatteryRecharge(batteryCurrentLevel,energyConsumption,sleepingMiliSeconds);
        //while (energyConsumption > (batteryCurrentLevel - batteryMinLevel)) {
        while (batteryCurrentLevel <= (energyConsumption +batteryMinLevel)) {
            try {
                System.out.println("Battery is charging ");
                System.out.println("batteryCurrentLevel "+batteryCurrentLevel);
                System.out.println("sleepingMiliSeconds "+sleepingMiliSeconds);
                System.out.println("sleepingMiliSeconds*(8/3000) "+(double)sleepingMiliSeconds*(8/3)/1000);
                batteryCurrentLevel = (batteryCurrentLevel+(double)((double)sleepingMiliSeconds/1000)*(8/3)); 
                //batteryCurrentLevel = energyConsumption+1;
                //printer.printBatteryLevel(batteryCurrentLevel);
                printer.printbatteryRecharge(batteryCurrentLevel,energyConsumption,sleepingMiliSeconds);
                Thread.sleep(sleepingMiliSeconds);
            } catch (InterruptedException ex) {
                Logger.getLogger(batteryMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        movement(batteryCurrentLevel,jointmove,energyConsumption);
    }
    
    private void movement(double batteryCurrentLevel, double jointmove, double energyConsumption){
        
        sleepingMiliSecondsMovement = (long)((Math.abs(jointmove)/15)*1000);
        //printer.printMovmentTake(sleepingMiliSecondsMovement);
        try {
            
            switch (movementFlextionOrRotation) {
                    case 0:
                        double current = m[index].getCurrentRotation();
                        printer.printMove(index, movementFlextionOrRotation, current, endpoint, energyConsumption);
                        break;
                    case 1:
                        current = m[index].getCurrentFlexion();
                        printer.printMove(index, movementFlextionOrRotation, current, endpoint, energyConsumption);
                        break;
            }
        printer.printMovmentTake(sleepingMiliSecondsMovement);    
        Thread.sleep(sleepingMiliSecondsMovement);
        } catch (InterruptedException ex) {
            Logger.getLogger(batteryMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
       // batteryCurrentLevel = (batteryCurrentLevel-(double)((double)sleepingMiliSecondsMovement/1000)*(energyConsumption));
        //batteryCurrentLevel = batteryCurrentLevel- energyConsumption;
        System.out.println("batteryCurrentLevel :"+batteryCurrentLevel);
        System.out.println("-------------------------------");
    }

    public double getBatteryCurrentLevel() {
        return batteryCurrentLevel;
    }

    public void setBatteryCurrentLevel(double batteryCurrentLevel) {
        this.batteryCurrentLevel = batteryCurrentLevel;
    }
    
    
}
