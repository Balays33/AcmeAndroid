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
    MotorJoint[] m;
    Data d = new Data();


    /**
     * 
     * @param r the current rotation values 
     * @param f the current flexion values
     * @return array within all motors
     */
    public MotorJoint[] setupMethod(double[] r,double[] f)
    {
    //        Ankle =  new MotorJoint(d.getAnkleRotation(), 0, 0, 0, d.getAnkleVoltage()); 
// this is start should update it

        //loop to generate the motors in an array
        for(int i=0;i<d.getMotorName().length;i++)
        {
            m[i].setCurrentRotation(r[i]);
            m[i].setCurrentFlexion(f[i]);
        }
        return m;
    }  
}
