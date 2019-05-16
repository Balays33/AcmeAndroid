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
public class Setup {
    
    MotorJoint Ankle;
    MotorJoint Knee;
    MotorJoint Hip;
    MotorJoint Waist;
    MotorJoint  Wrist;
    MotorJoint Elbow;
    MotorJoint Shoulder;
    MotorJoint Neck;
    MotorJoint Head;
    
    Data d = new Data();
    
    private void setupMethod(){
       // Ankle =  new MotorJoint(d.getAnkleRotation(), 0, 0, 0, d.getAnkleVoltage()); // this is start should update it
       Ankle = new MotorJoint(0, 0, 0, 0, 0);
    }
    
    private void printOutData(MotorJoint passObject){
        passObject.toString();
    }
}
    