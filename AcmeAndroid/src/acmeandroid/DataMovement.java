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

     public void setStandToSit()
    {
              // fill data here
        int[] move;
        
        /*         
                        POSITION 0 data    
        */
        
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     this.sitDown.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 90};       this.sitDown.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};      this.sitDown.add(move);       //Ankle right - rotation
        move = new int[]{13, 1, 90};      this.sitDown.add(move);      //Ankle right - flexion
        move = new int[]{12, 0, 0};        this.sitDown.add(move);         //Knee left - rotation
        move = new int[]{12, 1, 0};       this.sitDown.add(move);        //Knee left - flexion 
        move = new int[]{11, 0, 0};       this.sitDown.add(move);        //Knee right - rotation
        move = new int[]{11, 1, 0};       this.sitDown.add(move);         //Knee right - flexion       
        move = new int[]{10, 0, 0};         this.sitDown.add(move);     //Hip left - rotation
         move = new int[]{10, 1, 0};       this.sitDown.add(move);    //Hip left - flexion        
        move = new int[]{9, 0,0};      this.sitDown.add(move);          //Hip right - rotation
        move = new int[]{9, 1,0};     this.sitDown.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 0};     this.sitDown.add(move);         //Weist - rotation
         move = new int[]{8, 1, 0};    this.sitDown.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};      this.sitDown.add(move);      //Wrist left - rotation
        move = new int[]{7, 1, 0};    this.sitDown.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};        this.sitDown.add(move);        //Wrist right - rotation
         move = new int[]{6, 1, 0};       this.sitDown.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};          this.sitDown.add(move);         //Elbow left - rotation
        move = new int[]{5, 1, 0};      this.sitDown.add(move);      //Elbow left - flexion
        move = new int[]{4, 0, 0};     this.sitDown.add(move);            //Elbow right - rotation
        move = new int[]{4, 1, 0};     this.sitDown.add(move);             //Elbow right - flexion
        move = new int[]{3, 0, 0};       this.sitDown.add(move);           //Shoulder left - rotation
         move = new int[]{3, 1, 0};       this.sitDown.add(move);           //Shoulder left - flexion
        move = new int[]{2, 0, 0};     this.sitDown.add(move);        //Shoulder right - rot
        move = new int[]{2, 1, 0};    this.sitDown.add(move);         //Shoulder right - flex
        move = new int[]{1, 0, 0};      this.sitDown.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     this.sitDown.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};     this.sitDown.add(move);       //Head - rotation
         move = new int[]{0, 1, 0};      this.sitDown.add(move);        //Head - flexion  
  
               /*         
                        POSITION 1 data    
        */
        
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     this.sitDown.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 90};       this.sitDown.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};      this.sitDown.add(move);       //Ankle right - rotation
        move = new int[]{13, 1, 90};      this.sitDown.add(move);      //Ankle right - flexion
        move = new int[]{12, 0, 0};        this.sitDown.add(move);         //Knee left - rotation
        move = new int[]{12, 1, 0};       this.sitDown.add(move);        //Knee left - flexion 
        move = new int[]{11, 0, 0};       this.sitDown.add(move);        //Knee right - rotation
        move = new int[]{11, 1, 0};       this.sitDown.add(move);         //Knee right - flexion       
        move = new int[]{10, 0, 0};         this.sitDown.add(move);     //Hip left - rotation
         move = new int[]{10, 1, 0};       this.sitDown.add(move);    //Hip left - flexion        
        move = new int[]{9, 0,0};      this.sitDown.add(move);          //Hip right - rotation
        move = new int[]{9, 1,0};     this.sitDown.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 0};     this.sitDown.add(move);         //Weist - rotation
         move = new int[]{8, 1, 0};    this.sitDown.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};      this.sitDown.add(move);      //Wrist left - rotation
        move = new int[]{7, 1, 0};    this.sitDown.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};        this.sitDown.add(move);        //Wrist right - rotation
         move = new int[]{6, 1, 0};       this.sitDown.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};          this.sitDown.add(move);         //Elbow left - rotation
        move = new int[]{5, 1, 0};      this.sitDown.add(move);      //Elbow left - flexion
        move = new int[]{4, 0, 0};     this.sitDown.add(move);            //Elbow right - rotation
        move = new int[]{4, 1, 0};     this.sitDown.add(move);             //Elbow right - flexion
        move = new int[]{3, 0, 0};       this.sitDown.add(move);           //Shoulder left - rotation
         move = new int[]{3, 1, 0};       this.sitDown.add(move);           //Shoulder left - flexion
        move = new int[]{2, 0, 0};     this.sitDown.add(move);        //Shoulder right - rot
        move = new int[]{2, 1, 0};    this.sitDown.add(move);         //Shoulder right - flex
        move = new int[]{1, 0, 0};      this.sitDown.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     this.sitDown.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};     this.sitDown.add(move);       //Head - rotation
         move = new int[]{0, 1, 0};      this.sitDown.add(move);        //Head - flexion  
         
         
         
         
    } 
    
    
    public void setSitToStand()
    {
           int[] move;
           ArrayList position;// ArayList to hold all positions
// flexion = 1 // rotation = 0
// required degrees for the move    
        //position 1
        position= new ArrayList();
            move = new int[]{14, 1, 15};           position.add(move);// Ankle left : 30 deg.   Voltage required : 3 volts
            move = new int[]{13, 1, 15};           position.add(move);// Ankle right: 30 deg.   Voltage required : 3 volts
            move = new int[]{12, 1, 45};           position.add(move);// Knee Left :90 deg.  Voltage required : 3 volts
            move = new int[]{11, 1, 45};           position.add(move);// Kne Right :90 deg.  Voltage required : 3 volts
            move = new int[]{5, 1, 15};           position.add(move);// Elbow left : 140 deg. Voltage required : 3 volts
            move = new int[]{4, 1, 15};           position.add(move);// Elbow Right :140 deg. Voltage required : 3 volts
        this.standUp.add(position);
        //position 2
        position= new ArrayList();
            move = new int[]{5, 1, 15};           position.add(move);// Elbow left : 140 deg. Voltage required : 3 volts
            move = new int[]{4, 1, 15};           position.add(move);// Elbow Right :140 deg. Voltage required : 3 volts
            move = new int[]{3, 1, 15};           position.add(move);// Shoulder Left : 360 rotation / 180 flexion. Voltage required : 2 volts
            move = new int[]{2, 1, 15};           position.add(move);// Shoulder right : 360 rotation / 180 flexion. Voltage required : 2 volts
        this.standUp.add(position);
        //position 3
        position= new ArrayList();
            move = new int[]{10, 1, 15};           position.add(move);// Hip Left :90 deg.  Voltage required : 3 volts
            move = new int[]{9, 1, 15};           position.add(move);// Hip Right 90 deg.  Voltage required : 4 volts
            move = new int[]{8, 1, 15};           position.add(move);// Waist : 30 deg. rotation / 90 deg. flexion.  Voltage required : 4 volts
            move = new int[]{5, 1, 30};           position.add(move);// Elbow left : 140 deg. Voltage required : 3 volts
            move = new int[]{4, 1, 30};           position.add(move);// Elbow Right :140 deg. Voltage required : 3 volts
            move = new int[]{3, 1, 15};           position.add(move);// Shoulder Left : 360 rotation / 180 flexion. Voltage required : 2 volts
            move = new int[]{2, 1, 15};           position.add(move);// Shoulder right : 360 rotation / 180 flexion. Voltage required : 2 volts
        this.standUp.add(position);
        //position 4
        position= new ArrayList();
            move = new int[]{14, 1, 10};           position.add(move);// Ankle left : 30 deg.   Voltage required : 3 volts
            move = new int[]{13, 1, 10};           position.add(move);// Ankle right: 30 deg.   Voltage required : 3 volts
            move = new int[]{12, 1, 15};           position.add(move);// Knee Left :90 deg.  Voltage required : 3 volts
            move = new int[]{11, 1, 15};           position.add(move);// Kne Right :90 deg.  Voltage required : 3 volts
            move = new int[]{3, 1, 5};           position.add(move);// Shoulder Left : 360 rotation / 180 flexion. Voltage required : 2 volts
            move = new int[]{2, 1, 5};           position.add(move);// Shoulder right : 360 rotation / 180 flexion. Voltage required : 2 volts
        this.standUp.add(position);
        //position 5
        position= new ArrayList();
            move = new int[]{14, 1, 10};           position.add(move);// Ankle left : 30 deg.   Voltage required : 3 volts
            move = new int[]{13, 1, 10};           position.add(move);// Ankle right: 30 deg.   Voltage required : 3 volts
            move = new int[]{12, 1, 75};           position.add(move);// Knee Left :90 deg.  Voltage required : 3 volts
            move = new int[]{11, 1, 75};           position.add(move);// Kne Right :90 deg.  Voltage required : 3 volts
            move = new int[]{10, 1, 75};           position.add(move);// Hip Left :90 deg.  Voltage required : 3 volts
            move = new int[]{9, 1, 75};           position.add(move);// Hip Right 90 deg.  Voltage required : 4 volts
            move = new int[]{8, 1, 15};           position.add(move);// Waist : 30 deg. rotation / 90 deg. flexion.  Voltage required : 4 volts
            move = new int[]{3, 1, 10};           position.add(move);// Shoulder Left : 360 rotation / 180 flexion. Voltage required : 2 volts
            move = new int[]{2, 1, 10};           position.add(move);// Shoulder right : 360 rotation / 180 flexion. Voltage required : 2 volts
        this.standUp.add(position);


    } 

    
    public void setStandToWalk() {

        // fill data here
        int[] move;
        ArrayList position;// ArayList to hold all positions
        
        /*         
                        POSITION 0 data    
        */
        position= new ArrayList();
        
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 0};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 30};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 0};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 45};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 90};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1,0};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 0};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 15};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 90};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 90};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 40};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 0};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 0};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);
         
       /*         
                        POSITION 1 data    
        */
        position= new ArrayList();
       
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 8};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 22};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 45};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 90};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 60};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1,15};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 8};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 7};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 90};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 90};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 30};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 10};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 4};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);

        /*         
                        POSITION 2 data    
        */
         position= new ArrayList();
       
     
        move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 15};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 15};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 0};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 90};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 30};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1,30};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 15};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 0};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 60};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 60};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 20};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 20};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 8};    position.add(move);       //Head - flexion  
                this.walkForward.add(position);

          /*         
                        POSITION 3 data    
        */
         position= new ArrayList();
       
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 22};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 8};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 0};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 90};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 15};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 60};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 22};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 7};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 60};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 60};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 10};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 30};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 12};    position.add(move);       //Head - flexion  
         
        this.walkForward.add(position);

          /*         
                        POSITION 4 data    
        */
         position= new ArrayList();
       
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 30};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 0};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 45};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 0};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1,0};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 90};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 30};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 15};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 60};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 60};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 0};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 40};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 15};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);
         
         
          /*         
                        POSITION 5 data    
        */
         position= new ArrayList();
       
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 22};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 8};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 90};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 45};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 15};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 60};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 22};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 7};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 60};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 60};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 10};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 30};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 12};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);
               
         
          /*         
                        POSITION 6 data    
        */
         position= new ArrayList();
       
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 15};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 15};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 90};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 0};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 30};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 30};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 15};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 0};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 60};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 60};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 20};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 20};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 8};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);

        
        /*         
                        POSITION 7 data    
        */
          position= new ArrayList();
      
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 8};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 22};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 45};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 0};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 60};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 15};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 8};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 7};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 90};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 90};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 30};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 10};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1, 4};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);
         
          /*         
                        POSITION 8  LAST data    
        */
        position= new ArrayList();
        
        // int =  { motor name, rotation (0) or flextion (1)  , degree }
       move = new int[]{14, 0, 0};     position.add(move);         //Ankle left - rotation 0           
        move = new int[]{14, 1, 0};     position.add(move);    //Ankle left - flexion  1
        move = new int[]{13, 0, 0};    position.add(move);     //Ankle right - rotation
        move = new int[]{13, 1, 30};    position.add(move);     //Ankle right - flexion
        move = new int[]{12, 0, 0};      position.add(move);       //Knee left - rotation
        move = new int[]{12, 1, 0};      position.add(move);       //Knee left - flexion 
        move = new int[]{11, 0, 0};     position.add(move);       //Knee right - rotation
        move = new int[]{11, 1, 40};     position.add(move);       //Knee right - flexion       
        move = new int[]{10, 0, 0};         position.add(move);      //Hip left - rotation
         move = new int[]{10, 1, 90};         position.add(move);      //Hip left - flexion        
        move = new int[]{9, 0,0};    position.add(move);            //Hip right - rotation
        move = new int[]{9, 1, 0};    position.add(move);            //Hip right - flexion
        move = new int[]{8, 0, 0};   position.add(move);           //Weist - rotation
         move = new int[]{8, 1, 15};   position.add(move);           //Weist - flexion
        move = new int[]{7, 0, 0};    position.add(move);         //Wrist left - rotation
        move = new int[]{7, 1, 0};    position.add(move);         //Wrist left - flex
        move = new int[]{6, 0, 0};      position.add(move);         //Wrist right - rotation
         move = new int[]{6, 1, 0};      position.add(move);         //Wrist right - flexion
        move = new int[]{5, 0, 0};        position.add(move);        //Elbow left - rotation
        move = new int[]{5, 1, 90};        position.add(move);        //Elbow left - flexion
        move = new int[]{4, 0, 0};    position.add(move);              //Elbow right - rotation
        move = new int[]{4, 1, 90};    position.add(move);              //Elbow right - flexion
        move = new int[]{3, 0, 40};       position.add(move);          //Shoulder left - rotation
         move = new int[]{3, 1, 0};       position.add(move);          //Shoulder left - flexion
        move = new int[]{2, 0, 0};    position.add(move);       //Shoulder right - rot
        move = new int[]{2, 1, 0};    position.add(move);       //Shoulder right - flex
        move = new int[]{1, 0, 0};     position.add(move);      //Neck rotation\
         move = new int[]{1, 1, 0};     position.add(move);      //Neck flexion
        move = new int[]{0, 0, 0};    position.add(move);       //Head - rotation
         move = new int[]{0, 1,0};    position.add(move);       //Head - flexion  
        this.walkForward.add(position);
         
                
        
        
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
