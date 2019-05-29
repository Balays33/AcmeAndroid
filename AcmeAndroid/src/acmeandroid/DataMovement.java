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
        //position 1
        move = new int[]{14, 1, 45};         this.standUp.add(move);
        move = new int[]{13, 1, 45};         this.standUp.add(move);
        move = new int[]{12, 1, 45};         this.standUp.add(move);
        move = new int[]{11, 1, 45};         this.standUp.add(move);
        move = new int[]{5, 1, 15};         this.standUp.add(move);
        move = new int[]{4, 1, 15};         this.standUp.add(move);
        //position 2
        move = new int[]{5, 1, 15};         this.standUp.add(move);
        move = new int[]{4, 1, 15};         this.standUp.add(move);
        move = new int[]{3, 1, 15};         this.standUp.add(move);
        move = new int[]{2, 1, 15};         this.standUp.add(move);
        //position 3
        move = new int[]{10, 1, 15};         this.standUp.add(move);
        move = new int[]{9, 1, 15};         this.standUp.add(move);
        move = new int[]{8, 1, 15};         this.standUp.add(move);
        //position 4
        move = new int[]{14, 1, 15};         this.standUp.add(move);
        move = new int[]{13, 1, 15};         this.standUp.add(move);
        move = new int[]{12, 1, 15};         this.standUp.add(move);
        move = new int[]{11, 1, 15};         this.standUp.add(move);
        //position 5
        move = new int[]{14, 1, 15};         this.standUp.add(move);
        move = new int[]{13, 1, 15};         this.standUp.add(move);
        move = new int[]{12, 1, 75};         this.standUp.add(move);
        move = new int[]{11, 1, 75};         this.standUp.add(move);
        move = new int[]{10, 1, 75};         this.standUp.add(move);
        move = new int[]{9, 1, 75};         this.standUp.add(move);
        move = new int[]{8, 1, 15};         this.standUp.add(move);


    } 

    
    public void setStandToWalk() {

        // fill data here
        int[] move;
        
        // Notes : I didnt add rotation for every motor. Just added rotation when it occurs according to our documentation.
        
        
        /*
            
                        POSITION 0 data
        
        */
        
        //Ankle left            { motor name, rotation or flextion , degree }
        move = new int[]{14, 1, 0};
        this.walkForward.add(move);

        //Ankle right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Knee left
        move = new int[]{12, 1, 0};
        this.walkForward.add(move);

        //Knee right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Hip left
        move = new int[]{14, 1, 0};
        this.walkForward.add(move);

        //Hip right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Weist
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Wrist left
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Wrist right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Elbow left
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Elbow right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Shoulder left
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Shoulder right
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Neck
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        //Head
        move = new int[]{13, 1, 30};
        this.walkForward.add(move);

        /*
            
                        POSITION 1 data
        
        */
        
        
        
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
