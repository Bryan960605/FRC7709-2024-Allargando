// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimeLightSubsystem extends SubsystemBase {
  /** Creates a new LimeLightSubsystem. */
  private final NetworkTable limeLight;
  private final NetworkTableEntry tx;

  public LimeLightSubsystem() {
    limeLight = NetworkTableInstance.getDefault().getTable("limelight");
    tx = limeLight.getInstance().getEntry("tx");
  }

  public double getNoteAngle(){
    return tx.getDouble(0)
    ;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
