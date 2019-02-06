/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.ArmCommands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.subsystems.Arm;

/**
 * Add your docs here.
 */
public class ReleaseBrake extends InstantCommand {
  /**
   * Add your docs here.
   */
  public ReleaseBrake() {
    super();
    requires(Robot.arm);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Arm.releaseBrake();
  }

}