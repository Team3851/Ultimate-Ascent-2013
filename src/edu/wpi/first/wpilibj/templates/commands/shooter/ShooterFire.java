/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 * @author 3851
 */
public class ShooterFire extends CommandGroup{
    public ShooterFire() {
        //run shooter motors, wait for motors to reach full speed, load frisbee (fires), return
        addParallel(new ShooterRunShooters());
        addSequential(new WaitCommand(.4));
        addSequential(new ShooterLoad(1));
        addSequential(new ShooterReturn());
        addSequential(new ShooterDoNothing());
    }

    
}
