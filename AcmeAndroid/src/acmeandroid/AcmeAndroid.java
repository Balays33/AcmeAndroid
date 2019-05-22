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
public class AcmeAndroid {

    
    
    
    public static void main(String[] args) {

        Logic logic1 = new Logic();
        Printer printer1 = new Printer();
        
        
        
        printer1 = logic1.printWelcome(printer1);
        logic1.showMenu();
        
        
        
        
        /*
        // comment by Michal
        MotorJoint[] test2;
        Setup test = new Setup();
        
        // comment by Balazs 
            // test the batterymonitor  Knee  : 90 deg.  Voltage required : 3 volts
        batteryMonitor bm = new batteryMonitor();
        bm.setBatteryCurrentLevel(2);
        bm.allowMove(1, 0, 75);

        // only for testing
        // comment by Michal

<<<<<<< HEAD
        //System.out.println("Creating array of MotorJoin objects");
        //test2 = test.setupMethod(MotorJoint);

        //System.out.println("Creating array of MotorJoin objects");        
        //test2 = test.setupMethod();        
=======
        System.out.println("Creating array of MotorJoin objects");
  //test2 = test.setupMethod(MotorJoint);

        System.out.println("Creating array of MotorJoin objects");        
        test2 = test.setupMethod();        
>>>>>>> ad2f0cb14802328590f556d2fc705d8a4d250244

        System.out.println("MotorJoin objects created. ");

        // this is just test for loop - delete it later
        // comment by Michal
<<<<<<< HEAD
        /*
        for (int i = 0; i < test2.length; i++) {
=======
        for (int i = 0; i < test2.length; i++)
        {
>>>>>>> ad2f0cb14802328590f556d2fc705d8a4d250244
            // checking data
            System.out.println("Energy consumption in MotorJoint number : " + i + " is : " + test2[i].getEnergyConsumption());
            System.out.println("Max flexion in MotorJoint number : " + i + " is : " + test2[i].getMaximumFlexion());

        }
<<<<<<< HEAD
        */
=======
*/
        
      
>>>>>>> ad2f0cb14802328590f556d2fc705d8a4d250244
    }
    
    
    
}
