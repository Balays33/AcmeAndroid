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
public class Setup 
{
    public Setup() {}

    MotorJoint Ankle;
    MotorJoint Knee;
    MotorJoint Hip;
    MotorJoint Waist;
    MotorJoint  Wrist;
    MotorJoint Elbow;
    MotorJoint Shoulder;
    MotorJoint Neck;
    MotorJoint Head;
    
    Data d = new Data();
    
    /*
    private void setupMethod(){
       // Ankle =  new MotorJoint(d.getAnkleRotation(), 0, 0, 0, d.getAnkleVoltage()); // this is start should update it
       Ankle = new MotorJoint(00, 00, 00, 00, 00);
    }
    
*/
    
    private void printOutData(MotorJoint passObject){
        passObject.toString();

    public MotorJoint[] setupMethod()
    {
        Data d = new Data();
        MotorJoint[] m = new MotorJoint[d.getMotorName().length];
        //loop to generate the motors in an array
        for(int i=0;i<d.getMotorName().length;i++)
        {
            //        MotorJoint(double maximumRotation, double maximumFlexion, double energyConsumption) {
            m[i]= new MotorJoint(d.getMaxRotation()[i],d.getMaxFlextion()[i],d.getEnergyConsumption()[i]);
        }
        return m;

    }

}
    