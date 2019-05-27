
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
        //parameters & constructors
        Printer printer = new Printer(); 
        Menu mn = new Menu();
        //flow
        printer.welcome();
        //mn.showMenu();
        
        /*   
        batteryMonitor bm = new batteryMonitor(printer);
        bm.setBatteryCurrentLevel(3);
        bm.allowMove(1, 0,36);
        */
        /*
        
        // comment by Michal
        MotorJoint[] mj;
        Setup mainSet = new Setup();
        

        // only for testing
        // comment by Michal
//        System.out.println("Creating array of MotorJoin objects");
       // mj = test.setupMethod(MotorJoint);
        System.out.println("Creating array of MotorJoin objects");        
        mj = mainSet.setupMethod();        
        System.out.println("MotorJoin objects created. ");

        // this is just test for loop - delete it later
        // comment by Michal
        for (int i = 0; i < mj.length; i++) {
            // checking data
            System.out.println("Energy consumption in MotorJoint number : " + i + " is : " + mj[i].getEnergyConsumption());
            System.out.println("Max flexion in MotorJoint number : " + i + " is : " + mj[i].getMaximumFlexion());

        }
*/
    }
    
    
    
}

