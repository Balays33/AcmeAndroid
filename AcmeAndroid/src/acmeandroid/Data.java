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
        "Head",//           0
        "Neck",//           1
        "Shoulder-Right",// 2
        "Shoulder-Left",//  3
        "Elbow-Right",//    4
        "Elbow-Left",//     5
        "Wrist-Right",//    6
        "Wrist-Left",//     7
        "Waist",//          8
        "Hip-Right",//      9
        "Hip-Left",//       10
        "Knee-Right",//     11
        "Knee-Left",//      12
        "Ankle-Right",//    13
        "Ankle-Left"//      14
    };
    private final double[][] zeroReference = new double[][]
    {//rotation,flexion
        {0,90},//"Ankle-Right",//   13
        {0,90},//"Ankle-Left"//     14
        {0,0}, //"Waist",//          8
        {0,0}, //"Hip-Right",//      9
        {0,0},//"Hip-Left",//      10
        {0,0},//"Knee-Right",//    11
        {0,0},//"Knee-Left",//     12
        {0,0}, //"Elbow-Right",//    4
        {0,0}, //"Elbow-Left",//     5
        {0,0}, //"Shoulder-Right",// 2
        {0,0}, //"Shoulder-Left",//  3
        {0,0}, //"Wrist-Right",//    6
        {0,0}, //"Wrist-Left",//     7
        {0,0}, //"Neck",//           1
        {0,0}  //"Head",//           0
    };    private final int[] priorisation= new int[]
    {
        13,//"Ankle-Right",//   13
        14,//"Ankle-Left"//     14
        8, //"Waist",//          8
        9, //"Hip-Right",//      9
        10,//"Hip-Left",//      10
        11,//"Knee-Right",//    11
        12,//"Knee-Left",//     12
        4, //"Elbow-Right",//    4
        5, //"Elbow-Left",//     5
        2, //"Shoulder-Right",// 2
        3, //"Shoulder-Left",//  3
        6, //"Wrist-Right",//    6
        7, //"Wrist-Left",//     7
        1, //"Neck",//           1
        0  //"Head",//           0
    };
    private final int[][] pairs= new int[][]{
        {2,3},//Shoulder
        {4,5},//Elbow
        {6,7},//Wrist
        {9,10},//Hip
        {11,12},//Knee
        {13,14} //Ankle
    };
    private final double[] energyConsumption = new double[]
    {
        3,//                "Head",//0
        3,//                "Neck",//1
        2,//                "Shoulder-Right",
        2,//                "Shoulder-Left",
        3,//                "Elbow-Right",
        3,//                "Elbow-Left",
        2,//                "Wrist-Right",
        2,//                "Wrist-Left",
        4,//                "Waist",
        4,//                "Hip-Right",
        4,//                "Hip-Left",
        3,//                "Knee-Right",
        3,//                "Knee-Left",
        3,//                "Ankle-Right",
        3//                 "Ankle-Left"//14
    };    
    private final double[] MaxRotation = new double[]
    {
        180,//                "Head",//0
        0,//                "Neck",//1
        180,//                "Shoulder-Right",
        180,//                "Shoulder-Left",
        0,//                "Elbow-Right",
        0,//                "Elbow-Left",
        0,//                "Wrist-Right",
        0,//                "Wrist-Left",
        90,//                "Waist",
        0,//                "Hip-Right",
        0,//                "Hip-Left",
        0,//                "Knee-Right",
        0,//                "Knee-Left",
        0,//                "Ankle-Right",
        0//                 "Ankle-Left"//14
    };    
    private final double[] MaxFlextion = new double[]
    {
        180,//                "Head",//0
        30,//                "Neck",//1
        360,//                "Shoulder-Right",
        360,//                "Shoulder-Left",
        140,//                "Elbow-Right",
        140,//                "Elbow-Left",
        180,//                "Wrist-Right",
        180,//                "Wrist-Left",
        30,//                "Waist",
        90,//                "Hip-Right",
        90,//                "Hip-Left",
        90,//                "Knee-Right",
        90,//                "Knee-Left",
        30,//                "Ankle-Right",
        30//                 "Ankle-Left"//14
    };    
    
    
    public String[] getMotorName() {
        return motorName;
    }
    
     // return String with specified one motor only
    public String getMotorNameAt(int index) {
        
        return motorName[index];
    }

    public double[] getEnergyConsumption() {
        return energyConsumption;
    }

    public double[] getMaxFlextion() {
        return MaxFlextion;
    }

    public double[] getMaxRotation() {
        return MaxRotation;

    }

    public int[] getPriorisation() {
        return priorisation;
    }

    public int[][] getPairs() {
        return pairs;
    }

    public double[][] getZeroReference() {
        return zeroReference;
    }
    

}
