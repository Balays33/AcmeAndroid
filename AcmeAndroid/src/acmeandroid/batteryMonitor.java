/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeandroid;

/**
 *
 * @authors 
 * Jhoms Mosquera
 * Eduardo Nakashima
 * Balazs Barcza
 * Javier Lopez Santacruz Serraller
 * Michał Świtała
 * 
 */
public class batteryMonitor {
    
    private double energyConsumption;
    private final int batteryMinLevel = 1;
    private final int batteryMaxLevel = 8;
    private double batteryActualLevel;
    private long miliseconds;
    
    
    /*
        the power plant is a cheap model of lithium battery from AndroidsRus and 
        can only produce 8 volts, its recovery time after discharging is 3 seconds.(2.6 volts per second)
    */
    public void battaryCheck(double energyConsumption){
        this.energyConsumption = energyConsumption;
        
        // battery check recharge
        if (batteryActualLevel == batteryMinLevel){
            
            Thread.sleep(miliseconds);
        }
    
    }
    
}
