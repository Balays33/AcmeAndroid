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
    private SetupStartPosition ssp= new SetupStartPosition();
    private batteryMonitor bm;
//    private MotorJoint[] mj;
    
    public Movement(){}
    public Movement(batteryMonitor b)    {        this.bm=b;    }
    
    /**
     * 
     * @param input user selected option (1 to 4)
     * @param mj all motors
     */
    public void start(int input,MotorJoint[] mj)
    {
//        dm = new DataMovement();
        DataInitial dIni = new DataInitial(input);
//        System.out.println("input: "+input);//debug porpouse
        ssp.setupMethod(dIni.getRotation(), dIni.getFlextion(),mj); //set the initial position

        switch (input)
        {
        case 1://stand up
//        System.out.println("rot array length: "+dIni.getRotation().length);//debug porpouse
//        System.out.println("flx array length: "+dIni.getFlextion().length);//debug porpouse
//        System.out.println("move array size: "+dm.getStandUp().size());//debug porpouse
//            System.out.println("Rotation "+dIni.toString(0));
//            System.out.println("Flextion "+dIni.toString(1));
            moving( dm.getStandUp(),mj);
            break;
        case 2://walk
            moving( dm.getWalkForward(),mj);
            break;
        case 3://sit down
            moving( dm.getSitDown(),mj);
            break;
        default:
            break;
        }
        
    }
    
/**
 * 
 * @param movePositions all sequential positions with all respective angles for all motors
 * @param mj All motors
 */
    private void moving(ArrayList movePositions, MotorJoint[] mj) 
    {   
        MotorJoint mm;
        int[] move;
        ArrayList moveSeq;
            
        for(int j=0;j<movePositions.size();j++)
        {
            moveSeq=(ArrayList)movePositions.get(j);
            for(int i=0;i<moveSeq.size();i++)
            {
                move = (int[]) moveSeq.get(i);
    //            System.out.println("motor "+move[0]);//debug porpouse
    //            System.out.println("1 for flextion: "+move[1]);//debug porpouse
    //            System.out.println("degrees "+move[2]);//debug porpouse

                int mIdx = (int)move[0];
                int mTyp = (int)move[1];
                double endPos = (double)move[2];
                mm = mj[move[0]];
                double iniPos = 0;

                if(move[1]==1)
                    { iniPos = mm.getCurrentFlexion(); }
                else
                    { iniPos = mm.getCurrentRotation(); }

                if(iniPos!=endPos)
                {
                    bm.allowMove(mIdx, mTyp, endPos);
                    //set motor to the required position
                    if(move[1]==1)
                        { mm.setCurrentFlexion((double)move[2]); }
                    else
                        { mm.setCurrentRotation((double)move[2]); }
                }
            }
        }
    }
    /**
     * 
     * @param moveSeq
     * @return 
     */
    private ArrayList synchroZeroReference(ArrayList moveSeq)
    {
        Data dt = new Data();
        dt.getZeroReference();//{rot,flex}[mjIdx]
        //not implemented cause where not time enought to work this through
    }

    private ArrayList synchroPriorisation(ArrayList moveSeq)
    {
        Data dt = new Data();
        
        for(int j=0;j<moveSeq.size();j++)
        {
            for(int i=0;i<moveSeq.size();i++)
            {

            }
        }
        
        dt.getPriorisation();
        
        
    
    }
    private ArrayList synchroPair(ArrayList moveSeq)
    {
        Data dt = new Data();
        dt.getPairs();

        
        
    
    }

}
