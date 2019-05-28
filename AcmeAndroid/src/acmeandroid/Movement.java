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
    private SetupStartPosition ssp= new SetupStartPosition();
    private batteryMonitor bm;
//    private MotorJoint[] mj;
    
    public Movement(){}
    public Movement(batteryMonitor b)    {        this.bm=b;    }
    
    public void start(int input,MotorJoint[] mj)
    {
//        dm = new DataMovement();
        DataInitial dIni = new DataInitial(input);
//        System.out.println("input: "+input);//debug porpouse
        switch (input)
        {
        case 1://stand up
//        System.out.println("rot array length: "+dIni.getRotation().length);//debug porpouse
//        System.out.println("flx array length: "+dIni.getFlextion().length);//debug porpouse
//        System.out.println("move array size: "+dm.getStandUp().size());//debug porpouse
//            System.out.println("Rotation "+dIni.toString(0));
//            System.out.println("Flextion "+dIni.toString(1));
            moving(dIni.getRotation(), dIni.getFlextion(), dm.getStandUp(),mj);
            break;
        case 2://walk
            moving(dIni.getRotation(), dIni.getFlextion(), dm.getWalkForward(),mj);
            break;
        case 3://sit down
            moving(dIni.getRotation(), dIni.getFlextion(), dm.getSitDown(),mj);
            break;
        default:
            break;
        }
        
    }

    private void moving(double[] r,double[] f,ArrayList moveSeq, MotorJoint[] mj) 
    {   
        MotorJoint mm;
        int[] move;
        ssp.setupMethod(r, f,mj); //set the initial position

        for(int i=0;i<moveSeq.size();i++)
        {
            move = (int[]) moveSeq.get(i);
            System.out.println("motor "+move[0]);
            System.out.println("1 for flextion: "+move[1]);
            System.out.println("degrees "+move[2]);
            
            int mIdx = (int)move[0];
            int mTyp = (int)move[1];
            double degrees = (double)move[2];
            
            bm.allowMove(mIdx, mTyp, degrees);
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
