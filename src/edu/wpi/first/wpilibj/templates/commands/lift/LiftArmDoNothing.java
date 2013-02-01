/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.lift;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 3851
 */
public class LiftArmDoNothing extends CommandBase{
    
    public LiftArmDoNothing() {
        requires(liftarm);
    }

    protected void initialize() {
    }

    protected void execute() {
        liftarm.doNothing();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
