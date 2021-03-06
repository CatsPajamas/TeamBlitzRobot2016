package org.usfirst.frc.team2083.robot.commands.buttons;

import org.usfirst.frc.team2083.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ButtonCommandSlowDown extends CommandGroup {
    
    public  ButtonCommandSlowDown() {    	
    	requires(CommandBase.leftDrive);
    	requires(CommandBase.rightDrive);
    	requires(CommandBase.armBar);
    	
       	addSequential(new TeleDriveCommand(.5));		//Set the speed multiplier to half-speed (50%)
    }
}
