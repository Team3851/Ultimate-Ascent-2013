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
public class ShooterDoNothing extends CommandBase{
    public ShooterDoNothing() {
        requires(shooter);
    }
    protected void initialize() {
    }

    protected void execute() {
        shooter.doNothing();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
