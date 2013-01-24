/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;


/**
 *
 * @author 3851
 */
public class DriveStraightBack extends CommandGroup{
    public DriveStraightBack() {
        addSequential(new DriveStraight2Seconds());
        addSequential(new WaitCommand(3));
        addSequential(new DriveBack2Seconds());
    }
}
