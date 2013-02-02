/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.shooter;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class ShooterReturn extends CommandBase{
    public ShooterReturn() {
        requires(shooter);
        
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return shooter.isRetreated();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
