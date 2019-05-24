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
    private long miliseconds;
    private boolean movementAllow =  true;
    private double movement;
    private double sixtydegree;
    
    
    MotorJoint[] m;
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
    
    
    public int index = 1;
     
    public boolean allowMove(int index, int movementFlextionOrRotation, double endpoint) {
        
        batteryRequire(index,movementFlextionOrRotation,endpoint);
        return movementAllow;    
    }

    private void batteryRequire(int index, int movementFlextionOrRotation, double endpoint) {

        //this.endpoint = endpoint;
        switch (movementFlextionOrRotation) {
            case 0:   // Rotation = 0
                /*
                if (endpoint > m[index].getCurrentRotation()) {
                    System.out.print("ERROR");
                    movementAllow = false;
                } else {

                    if (endpoint > m[index].getCurrentRotation()) {
                        sixtydegree = (60 * (m[index].getMaximumRotation() - m[index].getCurrentRotation()) / 100);
                    } else {
                        sixtydegree = (60 * (m[index].getCurrentRotation()) / 100);
                    }
                    System.out.println("sixtydegree = " + sixtydegree);
                    System.out.println("joint moves :" + (endpoint - m[index].getCurrentRotation()));
                    if (Math.abs(endpoint - m[index].getCurrentRotation()) > sixtydegree) {
                        //add extra 3 volt
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                    }
                }
                */
                ///*
                double maxRotation = 90;
                double currentP = 60;
                
                if (endpoint > maxRotation) {
                    System.out.println("ERROR");
                    movementAllow = false;
                } else {

                    if (endpoint > currentP) {
                        sixtydegree = (60 * (maxRotation - currentP) / 100);
                    } else {
                        sixtydegree = (currentP * 0.6);
                    }
                    System.out.println("sixtydegree = " + sixtydegree);
                    System.out.println("joint move :" + (endpoint - currentP));
                    if (Math.abs(endpoint - currentP) > sixtydegree) {
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                        System.out.println("energyConsumption: " + energyConsumption);
                    } else {
                        energyConsumption = 3;
                        System.out.println("energyConsumption: " + energyConsumption);
                    }
                }
                //*/
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
                        sixtydegree = (60 * (m[index].getCurrentFlexion()) / 100);
                    }
                    System.out.println("sixtydegree = " + sixtydegree);
                    System.out.println("Flexion moves :" + (endpoint - m[index].getCurrentFlexion()));
                    if (Math.abs(endpoint - m[index].getCurrentFlexion()) > sixtydegree) {
                        //add extra 3 volt
                        System.out.println("add extra 3 volt ");
                        energyConsumption = 3 + 3;
                    } else {
                        energyConsumption = m[index].getEnergyConsumption();
                    }
                }
                //*/
                break;
            default:
                System.out.print("ERROR");

        }
        if (movementAllow){
            batteryRecharge(energyConsumption);
            }
    }
    
    private void batteryRecharge(double energyConsumption){
        System.out.println("Battery Recharge method: ");
        System.out.println("Battery level : " +batteryCurrentLevel);
        System.out.println("energyConsumption level : " +energyConsumption);
        
        while (energyConsumption > (batteryCurrentLevel - batteryMinLevel)) {
            try {
                System.out.println("Battery is charging ");
                Thread.sleep(1000);
                batteryCurrentLevel++;
                System.out.println("Battery level : " + batteryCurrentLevel);
            } catch (InterruptedException ex) {
                Logger.getLogger(batteryMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public double getBatteryCurrentLevel() {
        return batteryCurrentLevel;
    }

    public void setBatteryCurrentLevel(double batteryCurrentLevel) {
        this.batteryCurrentLevel = batteryCurrentLevel;
    }
    
    
}
