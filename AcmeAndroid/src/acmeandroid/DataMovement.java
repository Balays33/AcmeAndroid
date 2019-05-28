/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acmeandroid;

import java.util.ArrayList;

/**
 *
 * @author duzen
 */
public class DataMovement 
{
    private ArrayList standUp= new ArrayList();// ArayList to hold all moves
    private ArrayList walkForward= new ArrayList();// ArayList to hold all moves
    private ArrayList sitDown= new ArrayList();// ArayList to hold all moves

    public DataMovement() 
    {
        setSitToStand();
        setStandToWalk();
    }

    public void setSitToStand()
    {
           int[] move;
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
        
           move =new int[]{ 00 , 0 , 30 }; 
           standUp.add(move);//motor, type of move and degrees
           move =new int[]{ 00 , 0 , 40 }; 
           standUp.add(move);//motor, type of move and degrees
    } 

    
    public void setStandToWalk() {

        // fill data here
        int[] move;

        move = new int[]{00, 0, 30};
        this.walkForward.add(move);

    }
    
    public ArrayList getStandUp() {
        return standUp;
    }

    public ArrayList getWalkForward() {
        return walkForward;
    }

    public ArrayList getSitDown() {
        return sitDown;
    }

}
