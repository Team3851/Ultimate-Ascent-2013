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
public class ShooterLoad extends CommandBase{
    public ShooterLoad(double timeout) {
        requires(shooter);
        setTimeout(timeout);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.load();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
