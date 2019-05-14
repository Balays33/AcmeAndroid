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
    private final double[] rotationIni = new double[]
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
    private final double[] flextionIni = new double[]
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

    public double[] getRotation() {
        return rotationIni;
    }

    public double[] getFlextion() {
        return flextionIni;
    }
    
}
