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
public class DataInitial {
    
    
    
       
    private double[] rotationIni;    
    private double[] flextionIni;    

    /*
    This variable should be set up the right position to sit
     */
    public DataInitial(int move) 
    {
        if(move==1){setSit();}
        else{setStand();}
        
    }
    private void setStand()
    {
            rotationIni = new double[]
        {
            0,//                "Head",//0  - All motors is inital at 0 when standing 
            0,//                "Neck",//1    exept the ancle in 90 degress. 
            0,//                "Shoulder-Right",
            40,//                "Shoulder-Left",
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
        flextionIni = new double[]
        {
            0,//               0 "Head",//0 - All initial position of the standing position is 
            0,//               1 "Neck",//1   initialise with 0.  
            0,//               2 "Shoulder-Right",
            0,//               3 "Shoulder-Left",
            90,//               4 "Elbow-Right",
            90,//               5 "Elbow-Left",
            0,//               6 "Wrist-Right",
            0,//              7  "Wrist-Left",
            15,//              8  "Waist",
            0,//              9  "Hip-Right",
            90,//              10  "Hip-Left",
            45,//              11  "Knee-Right",
            0,//              12  "Knee-Left",
            30,//              13  "Ankle-Right",
            0//               14  "Ankle-Left"//14
        };
    }

    private void setSit()
    {
            rotationIni = new double[]
            {
                0,//                "Head",//0
                0,//                "Neck",//1
                15,//                "Shoulder-Right",
                15,//                "Shoulder-Left",
                60,//                "Elbow-Right",
                60,//                "Elbow-Left",
                0,//                "Wrist-Right",
                0,//                "Wrist-Left",
                0,//                "Waist",
                90,//                "Hip-Right",
                90,//                "Hip-Left",
                45,//                "Knee-Right",
                45,//                "Knee-Left",
                0,//                "Ankle-Right",
                0//                 "Ankle-Left"//14
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
    public String toString(int MoveType)
    {
        String output="";
        double[] initial;
        if(MoveType==1)
        {initial=flextionIni;}else{initial=rotationIni;}
        for(int i=0;i<initial.length;i++)
        {
            output=output+" mj"+i+": "+initial[i];
        }
        return output;
    }
}
