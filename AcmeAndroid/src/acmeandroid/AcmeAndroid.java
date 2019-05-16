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

        // comment by Michal
        MotorJoint[] test2;
        Setup test = new Setup();

        // only for testing
        // comment by Michal
<<<<<<< HEAD
        System.out.println("Creating array of MotorJoin objects");
        test2 = test.setupMethod(MotorJoint);
=======
        System.out.println("Creating array of MotorJoin objects");        
        test2 = test.setupMethod();        
>>>>>>> a92b06604d1d5805afe60f79aade9d66aac97620
        System.out.println("MotorJoin objects created. ");

        // this is just test for loop - delete it later
        // comment by Michal
        for (int i = 0; i < test2.length; i++) {
            // checking data
            System.out.println("Energy consumption in MotorJoint number : " + i + " is : " + test2[i].getEnergyConsumption());
            System.out.println("Max flexion in MotorJoint number : " + i + " is : " + test2[i].getMaximumFlexion());

        }

    }
    
    
    
}
