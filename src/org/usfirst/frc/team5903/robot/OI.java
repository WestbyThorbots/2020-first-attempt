package com.swervedrivespecialties.exampleswerve;

import com.swervedrivespecialties.exampleswerve.subsystems.DrivetrainSubsystem;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.XboxController;
=======
import edu.wpi.first.wpilibj.Joystick;
>>>>>>> upstream/master
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class OI {
    /*
       Add your joysticks and buttons here
     */
    private XboxController XboxController0 = new XboxController(0);

    public double TriggerAxis = XboxController0.getTriggerAxis(0)*-1 + XboxController0.getTriggerAxis(1);

    public OI() {
        /*
        // Back button zeroes the drivetrain
        new JoystickButton(primaryJoystick, 7).whenPressed(
                new InstantCommand(() -> DrivetrainSubsystem.getInstance().getGyroscope().setAdjustmentAngle(
                        DrivetrainSubsystem.getInstance().getGyroscope().getUnadjustedAngle())
                )
        );
        */
    }


    public Joystick getXboxController() {
        return XboxController0;
    }
}
