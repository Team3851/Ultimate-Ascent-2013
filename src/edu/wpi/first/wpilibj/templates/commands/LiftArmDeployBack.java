/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class LiftArmDeployBack extends CommandBase{
    
    public LiftArmDeployBack() {
        requires(liftarm);
    }

    protected void initialize() {
    }

    protected void execute() {
        liftarm.deployBck();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
