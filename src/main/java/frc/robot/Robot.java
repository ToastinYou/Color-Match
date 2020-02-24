/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  @Override
  public void robotInit() {
    ColorSensor.Initialize();
  }

  @Override
  public void robotPeriodic() {
    if (Map.XboxControl.getAButtonPressed()) {
      ColorSensor.MotorSet(0.3);
    }
    else {
      ColorSensor.MotorSet(0);
    }
  }
}
