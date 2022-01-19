package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.LauncherSubsystem;

public class FireTopRowGroup extends SequentialCommandGroup {
    public FireTopRowGroup1(LauncherSubsystem launcherSubsystem) {
        super(
                new InstantCommand(launcherSubsystem::topLeft.set(true);),
                new WaitCommand(0.2),
                new InstantCommand(launcherSubsystem::topLeft.set(false))
        );
    }
    public FireTopRowGroup2(LauncherSubsystem launcherSubsystem) {
        super(
                new InstantCommand(launcherSubsystem::topMid.set(true);),
                new WaitCommand(0.2),
                new InstantCommand(launcherSubsystem::topMid.set(false))
        );
    }
    public FireTopRowGroup3(LauncherSubsystem launcherSubsystem) {
        super(
                new InstantCommand(launcherSubsystem::topRight.set(true);),
                new WaitCommand(0.2),
                new InstantCommand(launcherSubsystem::topRight.set(false))
        );
    }
}