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
    private DataMovement dm = new DataMovement();
//    private DataInitial dIni;// = new DataInitial();
    private SetupStartPosition ssp;
    private batteryMonitor bm;
    public Movement() 
    {
    }
    
    public void start(int input,MotorJoint[] mj)
    {
//        dm = new DataMovement();
        DataInitial dIni = new DataInitial(input);
//        System.out.println("input: "+input);//debug porpouse
        switch (input)
        {
        case 1://stand up
        System.out.println("rot: "+dIni.getRotation().length);//debug porpouse
        System.out.println("flex: "+dIni.getFlextion().length);//debug porpouse
        System.out.println("move: "+dm.getStandUp().size());//debug porpouse
            moving(dIni.getRotation(), dIni.getFlextion(), (ArrayList)dm.getStandUp(),mj);
            break;
        case 2://walk
            moving(dIni.getRotation(), dIni.getFlextion(), (ArrayList)dm.getStandUp(),mj);
            break;
        case 3://sit down
            moving(dIni.getRotation(), dIni.getFlextion(), (ArrayList)dm.getStandUp(),mj);
            break;
        default:
            break;
        }
        
    }

    private void moving(double[] r,double[] f,ArrayList moveSeq,MotorJoint[] mj) 
    {   
        MotorJoint mm;
        int[] move;
        ssp.setupMethod(r, f,mj); //set the initial position
        for(int i=0;i<moveSeq.size();i++)
        {
            move = (int[]) moveSeq.get(i);
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
