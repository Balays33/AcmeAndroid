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
    
    ArrayList standUp= new ArrayList();
    
    public void setSitToStand()
    {
           int[] move;
//        int a[]={33,3,4,5};//declaration, instantiation and initialization  
//0        "Head",
//1        "Neck",
//2        "Shoulder-Right",
//3        "Shoulder-Left",
//4        "Elbow-Right",
//5        "Elbow-Left",
//6        "Wrist-Right",
//7        "Wrist-Left",
//8        "Waist",
//9        "Hip-Right",
//10       "Hip-Left",
//11       "Knee-Right",
//12       "Knee-Left",
//13       "Ankle-Right",
//14       "Ankle-Left"//14
// flexion = 1 // rotation = 0
// required degrees for the move    
        
           move =new int[]{ 0,0,30}; standUp.add(move);//motor, type of move and degrees
           move =new int[]{ 0,0,40}; standUp.add(move);//motor, type of move and degrees
    } 
    

}
