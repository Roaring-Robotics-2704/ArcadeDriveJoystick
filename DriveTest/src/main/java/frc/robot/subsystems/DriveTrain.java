// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotContainer;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private final DifferentialDrive drive = new DifferentialDrive(RobotContainer.m_leftMotor, RobotContainer.m_rightMotor);
  public DriveTrain() {
  }
  public void arcadeDrive(double move, double turn){
    //move y-axis, turn z-axis
    drive.arcadeDrive(move, turn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
}
