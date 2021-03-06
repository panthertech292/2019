/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.AnalogInput;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmCommands.ArmControl;
//import frc.robot.commands.ArmCommands.EngageBrake;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static WPI_TalonSRX armMotor;
  //private static DoubleSolenoid brake;
  private final static double ticksPerDegree = 2.84;         //update this
  public final  double floorHeight = 0;
  public final  double hatch1Height = 19;
  public final  double hatch2Height = 47;
  public final  double hatch3Height = 75;
  public final  double port1Height = 27.5;
  public final  double port2Height = 55.5;
  public final  double port3Height = 83.5;

  public final double downSpeed = .2;
  public final double upSpeed = .7;
  public static AnalogInput pot;

  public Arm() {
    armMotor = new WPI_TalonSRX(RobotMap.armMotor);
    pot = new AnalogInput(RobotMap.pot);
    armMotor.configSelectedFeedbackSensor(FeedbackDevice.Analog);
  }

  public void armControl(double percent) {  
    armMotor.set(ControlMode.PercentOutput, percent);
  }

  public double getHeight() {
    double height;
    height = armMotor.getSelectedSensorPosition() / ticksPerDegree;
    return height;
  }
  public  double getFloorheight() {
    return floorHeight;
  }

  public  double getHatch1height() {
    return hatch1Height;
  }
  public  double getHatch2height() {
    return hatch2Height;
  }
  public  double getHatch3height() {
    return hatch3Height;
  }
  public  double getPort1height() {
    return port1Height;
  }
  public  double getPort2height() {
    return port2Height;
  }
  public  double getPort3height() {
    return port3Height;
  }
  


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmControl());
  }
}
