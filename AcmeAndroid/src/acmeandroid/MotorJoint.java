package acmeandroid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhoms Mosquera
 * @author Eduardo Nakashima
 * @author Balazs Barcza
 * @author Javier Lopez Santacruz Serraller
 * @author Michał Świtała
 * 
 */
public class MotorJoint {
    
    private final double maximumRotation;
    private final double maximumFlexion;
    private final double energyConsumption;
    private double currentRotation;
    private double currentFlexion;
    // gettter and setter

    public MotorJoint(double maximumRotation, double maximumFlexion, double energyConsumption) {
        this.maximumRotation = maximumRotation;
        this.maximumFlexion = maximumFlexion;
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

    @Override
    public String toString() {
        // has to be setup to print out the object value
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
