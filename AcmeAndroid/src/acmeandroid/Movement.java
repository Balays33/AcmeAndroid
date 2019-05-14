/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmeandroid;

import java.util.ArrayList;

/**
 *
 * @author Jhoms Mosquera
 * @author Eduardo Nakashima
 * @author Balazs Barcza
 * @author Javier Lopez Santacruz Serraller
 * @author Michał Świtała
 * 
 */
public class Movement 
{
    
    ArrayList SitToStand= new ArrayList();
    
    public void setSitToStand()
    {

//        int a[]={33,3,4,5};//declaration, instantiation and initialization  
            int move[]={0,0,0};//motor, type of move and degrees
//        "Head",//0
//        "Neck",//1
//        "Shoulder-Right",
//        "Shoulder-Left",
//        "Elbow-Right",
//        "Elbow-Left",
//        "Wrist-Right",
//        "Wrist-Left",
//        "Waist",
//        "Hip-Right",
//        "Hip-Left",
//        "Knee-Right",
//        "Knee-Left",
//        "Ankle-Right",
//        "Ankle-Left"//14

// flexion = 1 // ratation = 0
// required degrees for the move    
            SitToStand.add(move);
    }    

    }
