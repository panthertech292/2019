/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
 */
public class PhotoelectricSensor {

    private DigitalInput sensor;

    public PhotoelectricSensor(int x){
       sensor = new DigitalInput(x);
    }

    public boolean getValue(){
        return sensor.get();
    }

}
