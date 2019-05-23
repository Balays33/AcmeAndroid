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
public class DataSit {
    
    /*
    This variable should be set up the right position to sit
     */
    public DataSit() 
    {
        rotationIni = new double[]
        {
            0,//                "Head",//0
            0,//                "Neck",//1
            25,//                "Shoulder-Right",
            25,//                "Shoulder-Left",
            45,//                "Elbow-Right",
            45,//                "Elbow-Left",
            0,//                "Wrist-Right",
            0,//                "Wrist-Left",
            0,//                "Waist",
            90,//                "Hip-Right",
            90,//                "Hip-Left",
            135,//                "Knee-Right",
            135,//                "Knee-Left",
            45,//                "Ankle-Right",
            45//                 "Ankle-Left"//14
        };
        flextionIni = new double[]
        {
            0,//                "Head",//0 - initials  at 0 deg if turn to complete lelf is -90. 
            0,//                "Neck",//1
            0,//                "Shoulder-Right", - initials at 0 deg
            0,//                "Shoulder-Left", - initials at 0 deg
            0,//                "Elbow-Right",
            0,//                "Elbow-Left",
            0,//                "Wrist-Right",
            0,//                "Wrist-Left",
            0,//                "Waist", - initials at 0 degress 
            0,//                "Hip-Right",
            0,//                "Hip-Left",
            0,//                "Knee-Right",
            0,//                "Knee-Left",
            0,//                "Ankle-Right",
            0//                 "Ankle-Left"//14
        };
    }

    
    private final double[] rotationIni;    
    private final double[] flextionIni;    

    public double[] getRotation() {
        return rotationIni;
    }

    public double[] getFlextion() {
        return flextionIni;
    }

    //Return one rotation only at specified index
    public double getRotationAt(int index) {

        return rotationIni[index];
    }

    //Return one flextion only at specified index
    public double getFlextionAt(int index) {

        return flextionIni[index];
    }
}
