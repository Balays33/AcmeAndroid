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
public class SetupStartPosition 
{


    /**
     * 
     * @param r the current rotation values 
     * @param f the current flexion values
     * @param m MotorJoint array
     * @return array within all motors
     */
    public MotorJoint[] setupMethod(double[] r,double[] f, MotorJoint[] m)
    {
        Data d = new Data();
        //loop to update the motors in an array
        for(int i=0;i<d.getMotorName().length;i++)
        {
            m[i].setCurrentRotation(r[i]);
            m[i].setCurrentFlexion(f[i]);
        }
        return m;
    }  
}
