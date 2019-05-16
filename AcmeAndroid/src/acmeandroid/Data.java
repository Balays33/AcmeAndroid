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
public class Data {


 /**
 *
 *The reference array with motors identification String
 */
    public String[] motorName= new String[]
    {
        "Head",//0
        "Neck",//1
        "Shoulder-Right",
        "Shoulder-Left",
        "Elbow-Right",
        "Elbow-Left",
        "Wrist-Right",
        "Wrist-Left",
        "Waist",
        "Hip-Right",
        "Hip-Left",
        "Knee-Right",
        "Knee-Left",
        "Ankle-Right",
        "Ankle-Left"//14
    };
    private final double[] energyConsumption = new double[]
    {
        0,//                "Head",//0
        0,//                "Neck",//1
        0,//                "Shoulder-Right",
        0,//                "Shoulder-Left",
        0,//                "Elbow-Right",
        0,//                "Elbow-Left",
        0,//                "Wrist-Right",
        0,//                "Wrist-Left",
        0,//                "Waist",
        0,//                "Hip-Right",
        0,//                "Hip-Left",
        0,//                "Knee-Right",
        0,//                "Knee-Left",
        0,//                "Ankle-Right",
        0//                 "Ankle-Left"//14
    };    
    private final double[] MaxFlextion = new double[]
    {
        0,//                "Head",//0
        0,//                "Neck",//1
        0,//                "Shoulder-Right",
        0,//                "Shoulder-Left",
        0,//                "Elbow-Right",
        0,//                "Elbow-Left",
        0,//                "Wrist-Right",
        0,//                "Wrist-Left",
        0,//                "Waist",
        0,//                "Hip-Right",
        0,//                "Hip-Left",
        0,//                "Knee-Right",
        0,//                "Knee-Left",
        0,//                "Ankle-Right",
        0//                 "Ankle-Left"//14
    };    
    private final double[] MaxRotation = new double[]
    {
        0,//                "Head",//0
        0,//                "Neck",//1
        0,//                "Shoulder-Right",
        0,//                "Shoulder-Left",
        0,//                "Elbow-Right",
        0,//                "Elbow-Left",
        0,//                "Wrist-Right",
        0,//                "Wrist-Left",
        0,//                "Waist",
        0,//                "Hip-Right",
        0,//                "Hip-Left",
        0,//                "Knee-Right",
        0,//                "Knee-Left",
        0,//                "Ankle-Right",
        0//                 "Ankle-Left"//14
    };    
    
    
    public String[] getMotorName() {
        return motorName;
    }

    public double[] getEnergyConsumption() {
        return energyConsumption;
    }

    public double[] getMaxFlextion() {
        return MaxFlextion;
    }

    public double[] getMaxRotation() {
        return MaxRotation;

    /* 
        This is old version We have decided after the second meeting we will use an array to hold the parameters.
            comment by Balazs
    
    private double ankleRotation = 30;
    private double ankleVoltage = 3;
    private double kneeRotation = 90;
    private double kneeVoltage = 3;
    private double hipRotation = 90;
    private double hipVoltage = 4;
    private double waistRotation = 30;
    private double waistFlexion = 90;
    private double waistVoltage = 4;
    private double wristRotation = 180;
    private double wristVoltage = 2;
    private double elbowRotation = 140;
    private double elbowVoltage = 3;
    private double shoulderRotation = 360;
    private double shoulderVoltage = 2;
    private double neckRotation = 30;
    private double neckVoltage = 3;
    private double headRotation = 180;
    private double headFlexion = 180;
    private double headVoltage = 3;
    */
    
    private String[] motorName = new String[15];
    private double[] motorRotation = new double[15];
    private double[] motorFlexion = new double[15];
    private double[] energyConsumption =  new double[15];
    
    // We using String array to hold the motors name comment by Balazs
    
    public void setupDataMotor(){
        motorName[0] = "M0 Ankle Left";
        motorName[1] = "M1 Ankle Right";
        motorName[2] = "M2 Knee Left";
        motorName[3] = "M3 Knee Right";
        motorName[4] = "M4 Hip Left";
        motorName[5] = "M5 Hip Right";
        motorName[6] = "M6 Waist";
        motorName[7] = "M7 Wrist Left";
        motorName[8] = "M8 Wrist Right";
        motorName[9] = "M9 Elbow Left";
        motorName[10] = "M10 Elbow Right";
        motorName[11] = "M11 Shoulder Left";
        motorName[12] = "M12 Shoulder Right";
        motorName[13] = "M13 Neck";
        motorName[14] = "M13 Head";   
    }
    public void setupDataMotorRotation(){
        motorRotation[0] = 30;
        motorRotation[1] = 30;
        motorRotation[2] = 90;
        motorRotation[3] = 90;
        motorRotation[4] = 90;
        motorRotation[5] = 90;
        motorRotation[6] = 30;
        motorRotation[7] = 180;
        motorRotation[8] = 180;
        motorRotation[9] = 140;
        motorRotation[10] = 140;
        motorRotation[11] = 360;
        motorRotation[12] = 360;
        motorRotation[13] = 30;
        motorRotation[14] = 180;
    }
    public void setupDataMotorFlexion(){
        motorFlexion[6] =  90;
        motorFlexion[11] = 180;
        motorFlexion[12] = 180;
        motorFlexion[14] = 180;

    }
    public void setupDataEnergyConsumption(){
        energyConsumption[0] = 3;
        energyConsumption[1] = 3;
        energyConsumption[2] = 3;
        energyConsumption[3] = 3;
        energyConsumption[4] = 4;
        energyConsumption[5] = 4;
        energyConsumption[6] = 4;
        energyConsumption[7] = 2;
        energyConsumption[8] = 2;
        energyConsumption[9] = 3;
        energyConsumption[10] = 3;
        energyConsumption[11] = 2;
        energyConsumption[12] = 2;
        energyConsumption[13] = 3;
        energyConsumption[14] = 3;
        
    }

    public String[] getMotorName() {
        return motorName;
    }

    public double[] getMotorRotation() {
        return motorRotation;
    }

    public double[] getMotorFlexion() {
        return motorFlexion;
    }

    public double[] getEnergyConsumption() {
        return energyConsumption;
    }
    
    
}
