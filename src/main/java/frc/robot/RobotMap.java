/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // Motors
  public static int frontLeftMotor = 1;
  public static int frontRightMotor = 2;
  public static int rearLeftMotor = 3;
  public static int rearRightMotor = 4;
  public static int rollerMotor = 5;
  public static int backWheel = 7;
  public static int armMotor = 6;

  // Controllers
  public static int driveController = 0;
  public static int operController = 1;

  //Sensors
  public static int centerSensor = 0;
  public static int leftSensor = 1;
  public static int rightSensor = 2;
  public static int camera = 3;
  
  //Solenoids
  public static int backStilt12pcm = 1;
  public static int backStilt12in = 6;
  public static int backStilt12out = 7;

  public static int backStilt8pcm = 0;
  public static int backStilt8in = 0;
  public static int backStilt8out = 1;

  public static int frontStilts12pcm = 0;
  public static int frontStilts12in = 2;
  public static int frontStilts12out = 3;

  public static int frontStilts8pcm = 1;
  public static int frontStilts8in = 4;
  public static int frontStilts8out = 5;

  public static int gripperpcm = 1;
  public static int gripperin = 2;
  public static int gripperout = 3;

  public static int rollerpcm = 1;
  public static int rollerin = 0;
  public static int rollerout = 1;

  public static int tower1pcm = 0;
  public static int tower1in = 6;
  public static int tower1out = 7;

  public static int tower2pcm = 0;
  public static int tower2in = 4;
  public static int tower2out = 5;

  public static int brakepcm = 0;
  public static int brakein = 0;
  public static int brakeout = 0;

  //Cameras
  public static int pixyCam = 0;
}
