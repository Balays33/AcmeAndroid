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
        this.m = m;
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
                if (endpoint > m[index].getMaximumRotation()) {
                    System.out.print("ERROR");
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
                        printer.printEnergyConsumption(energyConsumption);
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                        printer.printEnergyConsumption(energyConsumption);
                    }
                }
                printer.batteryMonitorInfo(sixtydegree,jointmove,energyConsumption);
                //*/
                /*
                double maxRotation = 90;
                double currentP = 30;
                
                if (endpoint > maxRotation) {
                    System.out.println("ERROR");
                    movementAllow = false;
                } else {

                    if (endpoint > currentP) {
                        sixtydegree = (60 * (maxRotation - currentP) / 100);
                    } else {
                        sixtydegree = (currentP * 0.6);
                    }
                    jointmove = endpoint - currentP;
                   // printer.batteryMonitorInfo(sixtydegree,jointmove);
                    if (Math.abs(endpoint - currentP) > sixtydegree) {
                       // System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                        //printer.printEnergyConsumption(energyConsumption);
                    } else {
                        energyConsumption = 3;
                        //printer.printEnergyConsumption(energyConsumption);
                    }
                }
                printer.batteryMonitorInfo(sixtydegree,jointmove,energyConsumption);
                */
                break;
            case 1:   // flexion = 1 
                ///*
                if (endpoint > m[index].getCurrentFlexion()) {
                    System.out.print("ERROR");
                    movementAllow = false;
                } else {

                    if (endpoint > m[index].getCurrentFlexion()) {
                        sixtydegree = (60 * (m[index].getMaximumFlexion() - m[index].getCurrentFlexion()) / 100);
                    } else {
                        sixtydegree = (m[index].getCurrentFlexion() *0.6);
                    }
                    jointmove = endpoint - m[index].getCurrentFlexion();
                    //printer.batteryMonitorInfo(sixtydegree,jointmove);
                    if (Math.abs(endpoint - m[index].getCurrentFlexion()) > sixtydegree) {
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                        printer.printEnergyConsumption(energyConsumption);
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                        printer.printEnergyConsumption(energyConsumption);
                        
                    }
                }
                printer.batteryMonitorInfo(sixtydegree,jointmove,energyConsumption);
                //*/
                break;
            default:
                System.out.print("ERROR");

        }
        if (movementAllow){
            batteryRecharge(energyConsumption);
            movement(batteryCurrentLevel,jointmove,energyConsumption);
            }
        
    }
    
    private void batteryRecharge(double energyConsumption){
        //System.out.println("Battery Recharge method: ");
        //printer.printBatteryLevel(batteryCurrentLevel);
        //printer.printEnergyConsumption(energyConsumption);
        
        
        sleepingMiliSeconds = (long)(((energyConsumption + batteryMinLevel - batteryCurrentLevel)/8) * 3000);
        //System.out.println("sleepingMiliSeconds : " +sleepingMiliSeconds);
        
        printer.printbatteryRecharge(batteryCurrentLevel,energyConsumption,sleepingMiliSeconds);
        while (energyConsumption > (batteryCurrentLevel - batteryMinLevel)) {
            try {
                //System.out.println("Battery is charging ");
                Thread.sleep(sleepingMiliSeconds);
                batteryCurrentLevel = energyConsumption+1;
                printer.printBatteryLevel(batteryCurrentLevel);
            } catch (InterruptedException ex) {
                Logger.getLogger(batteryMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void movement(double batteryCurrentLevel, double jointmove, double energyConsumption){
        
        sleepingMiliSecondsMovement = (long)((Math.abs(jointmove)/15)*1000);
        printer.printMovmentTake(sleepingMiliSecondsMovement);
        try {
            Thread.sleep(sleepingMiliSecondsMovement);
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
        } catch (InterruptedException ex) {
            Logger.getLogger(batteryMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        batteryCurrentLevel = batteryCurrentLevel- energyConsumption;
        System.out.println("batteryCurrentLevel :"+batteryCurrentLevel);
    }

    public double getBatteryCurrentLevel() {
        return batteryCurrentLevel;
    }

    public void setBatteryCurrentLevel(double batteryCurrentLevel) {
        this.batteryCurrentLevel = batteryCurrentLevel;
    }
    
    
}
