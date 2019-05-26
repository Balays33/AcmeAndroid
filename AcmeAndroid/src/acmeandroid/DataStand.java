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
public class DataStand extends DataSit
{

    /*
    This variable should be set up the right position to stand
     */
    private double[] rotationIni ;    
    private double[] flextionIni ;    

    public DataStand() 
    {
        rotationIni = new double[]
        {
            0,//                "Head",//0  - All motors is inital at 0 when standing 
            0,//                "Neck",//1    exept the ancle in 90 degress. 
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
            90,//                "Ankle-Right",
            90//                 "Ankle-Left"//14
        }; 
        flextionIni = new double[]
        {
            0,//                "Head",//0 - All initial position of the standing position is 
            0,//                "Neck",//1   initialise with 0.  
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
    }


    
    
    

   
}
