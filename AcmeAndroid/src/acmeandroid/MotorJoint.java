package acmeandroid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MotorJoint {
    
    private final double maximumRotation;
    private double currentRotation;
    private final double maximumFlexion;
    private double currentFlexion;
    double energyConsumption;
    private double motorCurrentPosition;
    private double motorCurrentFlexion; // gettter and setter

    public MotorJoint(double maximumRotation, double currentRotation, double maximumFlexion, double currentFlexion, double energyConsumption) {
        this.maximumRotation = maximumRotation;
        this.currentRotation = currentRotation;
        this.maximumFlexion = maximumFlexion;
        this.currentFlexion = currentFlexion;
        this.energyConsumption = energyConsumption;
    }

    public double getMaximumRotation() {
        return maximumRotation;
    }

    public double getCurrentRotation() {
        return currentRotation;
    }

    public double getMaximumFlexion() {
        return maximumFlexion;
    }

    public double getCurrentFlexion() {
        return currentFlexion;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setCurrentRotation(double currentRotation) {
        this.currentRotation = currentRotation;
    }

    public void setCurrentFlexion(double currentFlexion) {
        this.currentFlexion = currentFlexion;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    @Override
    public String toString() {
        // has to be setup to print out the object value
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
