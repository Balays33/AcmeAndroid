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
    private DataMovement dm;
    private DataSit ds;
    private DataStand du;
    private MotorJoint[] mj;
    private SetupStartPosition ssp;
    private batteryMonitor bm;
    public Movement() 
    {
    }
    
    public void start(int input)
    {
        switch (input)
        {
        case 1://stand up
            moving(ds,dm.getStandUp());
            break;
        case 2://walk
            moving(du,dm.getWalkForward());
            break;
        case 3://sit down
            moving(du,dm.getSitDown());
            break;
        default:
            break;
            
        }
        
    }

    private void moving(DataSit d,ArrayList ar) 
    {   
        MotorJoint mm;
        int[] move;
        ssp.setupMethod(d.getRotation(), d.getFlextion()); //set the initial position
        for(int i=0;i<ar.size();i++)
        {
            move = (int[]) ar.get(i);
            bm.allowMove(move[0], move[1], (double)move[2]);
            //set motor to the required position
            mm = mj[move[0]];
            if(move[1]==1)
            {
                mm.setCurrentFlexion((double)move[2]);
            }
            else
            {
                mm.setCurrentRotation((double)move[2]);
            }
        }
    }
    

}
